package myInterfaces;

public interface MyList<T> {
    void add(T value);
    void remove(int index);
    void clear();
    int size();
    Object get(int index);
}
