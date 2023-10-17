package myInterfaces;

public interface MyStack<T> {
    void push(T value);
    void remove(int index);
    void clear();
    int size();
    Object peek();
    Object pop();
}
