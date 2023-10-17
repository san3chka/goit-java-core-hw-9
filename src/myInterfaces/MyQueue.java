package myInterfaces;

public interface MyQueue<T> {
    void add(T value);
    void clear();
    int size();
    Object peek();
    Object poll();
}
