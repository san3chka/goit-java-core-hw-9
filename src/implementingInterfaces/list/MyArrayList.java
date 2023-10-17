package implementingInterfaces.list;

import implementingInterfaces.Service;
import myInterfaces.MyList;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private static final int BASE_ARRAY_SIZE = 10;
    private Object[] elements;
    private int size;
    Service service;

    public MyArrayList() {
        elements = new Object[BASE_ARRAY_SIZE];
        size = 0;
    }

    public MyArrayList(int initArray) {
        elements = new Object[initArray];
        size = 0;
    }

    @Override
    public void add(T value) {
        service = new Service(elements, size);
        if(value == null) {
            throw new IllegalArgumentException("введён некорректный элемент");
        } else if(elements.length == size) {
            elements = service.arrayExpansion(elements, BASE_ARRAY_SIZE);
        }
        elements[size] = value;
        size++;
    }

    @Override
    public void remove(int index) {
        service = new Service(elements, size);
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
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("вы вышли за пределы массива");
        }

        return elements[index];
    }
}
