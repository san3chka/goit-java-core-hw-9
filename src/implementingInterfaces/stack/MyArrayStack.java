package implementingInterfaces.stack;

import implementingInterfaces.Service;
import myInterfaces.MyStack;
import java.util.Arrays;
import java.util.EmptyStackException;

public class MyArrayStack<T> implements MyStack<T> {
    private static final int BASE_ARRAY_SIZE = 10;
    private Object[] elements;
    private int size;
    Service service;

    public MyArrayStack() {
        elements = new Object[BASE_ARRAY_SIZE];
        size = 0;
        service = new Service(elements, size);
    }

    public MyArrayStack(int initArray) {
        elements = new Object[initArray];
        size = 0;
        service = new Service(elements, size);
    }

    @Override
    public void push(Object value) {
        if (value == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        } else if (elements.length == size) {
            elements = service.arrayExpansion(elements, BASE_ARRAY_SIZE);
        }
        elements[size] = value;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("вы вышли за пределы массива");
        }

        service.removeElement(index);
        size--;
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
        return elements[size - 1];
    }

    @Override
    public Object pop() {
        if(elements[0] == null) {
            throw new EmptyStackException();
        }
        Object temp = elements[size - 1];
        service.removeElement(size - 1);
        size--;
        return temp;
    }
}
