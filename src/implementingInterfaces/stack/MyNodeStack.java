package implementingInterfaces.stack;

import implementingInterfaces.node.Node;
import myInterfaces.MyStack;

import java.util.EmptyStackException;

public class MyNodeStack<T> implements MyStack<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyNodeStack() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void push(T value) {
        if (value == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        }

        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        }else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("вы вышли за пределы массива");
        }
        index = size - index - 1;


        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        Node<T> prev = current.getPrev();
        Node<T> next = current.getNext();

        if (prev != null)
            prev.setNext(next);
         else
            head = next;


        if (next != null)
            next.setPrev(prev);
        else
            tail = prev;

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
    public Object peek() {
        return tail.getValue();
    }

    @Override
    public Object pop() {
        if(head == null) {
            throw new EmptyStackException();
        }

        Object a = tail.getValue();
        tail = tail.getPrev();
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }
        size--;
        return a;
    }
}
