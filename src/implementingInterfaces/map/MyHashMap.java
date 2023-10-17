package implementingInterfaces.map;

import myInterfaces.MyMap;

import java.util.NoSuchElementException;

public class MyHashMap<K, V> implements MyMap<K, V> {
    Node<K, V> head;
    int size;

    public MyHashMap() {
        head = null;
        size = 0;
    }

    @Override
    public void put(K key, V value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        }

        Node<K,V> newNode = new Node<>(key, value);

        if (head == null) {
            head = newNode;
        } else {
            Node<K, V> temp = head;
            while (temp.getNext() != null) {
                if(temp.value == value){
                    return;
                }
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            size++;
        }
    }

    @Override
    public void remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        }

        Node<K,V> temp = head;

        while(temp != null) {
            if(temp.getKey().equals(key)) {
                head = temp.getNext();
                return;
            }

            if(temp.getNext().getKey().equals(key)) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
            }
        }
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(K key) {
        if (key == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        }

        Node<K,V> temp = head;
        Object value = null;
        while(temp != null) {
            if(temp.getKey().equals(key)) {
                value = temp.getValue();
                return value;
            } else {
                temp = temp.getNext();
            }
        }
        throw new NoSuchElementException("такого ключа нет в таблице");
    }

    private static class Node <K, V>{
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }

}


