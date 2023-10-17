package implementingInterfaces;

import java.util.Arrays;

public class Service {
    private Object[] elements;
    private int size;

    public Service(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    public Object[] arrayExpansion(Object[] arrayList, int expanseSize) {
        Object[] list;
        list = Arrays.copyOf(arrayList, arrayList.length + expanseSize);
        return list;
    }

    public void removeElement(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
    }
}
