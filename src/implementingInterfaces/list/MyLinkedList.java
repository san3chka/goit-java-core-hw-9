package implementingInterfaces.list;

import implementingInterfaces.node.Node;
import myInterfaces.MyList;

public class MyLinkedList<T> implements MyList<T> {
    private Node<T> head;
    private Node<T> tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


    @Override
    public void add(T value) {
        if(value == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        }

        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("вы вышли за пределы массива");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        Node<T> next = current.getNext();
        Node<T> prev = current.getPrev();

        if (next != null)
            next.setPrev(prev);
        else
            tail = prev;

        if (prev != null)
            prev.setNext(next);
        else
            head = next;

        size--;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("вы вышли за пределы массива");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }
}