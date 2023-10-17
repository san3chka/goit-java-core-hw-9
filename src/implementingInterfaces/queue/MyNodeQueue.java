package implementingInterfaces.queue;

import implementingInterfaces.node.Node;
import myInterfaces.MyQueue;

import java.util.EmptyStackException;

public class MyNodeQueue<T> implements MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyNodeQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T value) {
        if (value == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        }

        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
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
    public Object peek() {
        return head.getValue();
    }

    @Override
    public Object poll() {
        if (head == null) {
            throw new EmptyStackException();
        }

        Object a = head.getValue();
        head = head.getNext();
        size--;
        return a;
    }
}
