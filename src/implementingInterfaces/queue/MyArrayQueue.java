package implementingInterfaces.queue;

import implementingInterfaces.Service;
import myInterfaces.MyQueue;

import java.util.Arrays;
import java.util.EmptyStackException;


public class MyArrayQueue<T> implements MyQueue<T> {
    private static final int BASE_ARRAY_SIZE = 10;
    private Object[] elements;
    private int size;
    Service service;

    public MyArrayQueue() {
        elements = new Object[BASE_ARRAY_SIZE];
        size = 0;
    }

    public MyArrayQueue(int initArray) {
        elements = new Object[initArray];
        size = 0;
    }

    @Override
    public void add(T value) {
        if (value == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        } else if (elements.length == size) {
            elements = service.arrayExpansion(elements, BASE_ARRAY_SIZE);
        }
        elements[size] = value;
        size++;
    }

    @Override
    public void clear() {
        elements = new Object[]{};
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        return elements[0];
    }

    @Override
    public Object poll() {
        if(elements[0] == null) {
            throw new EmptyStackException();
        }
        service = new Service(elements, size);
        Object element = elements[0];
        service.removeElement(0);
        size--;
        return element;
    }
}
