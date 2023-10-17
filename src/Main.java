import implementingInterfaces.list.MyArrayList;
import implementingInterfaces.list.MyLinkedList;
import implementingInterfaces.map.MyHashMap;
import implementingInterfaces.queue.MyArrayQueue;
import implementingInterfaces.queue.MyNodeQueue;
import implementingInterfaces.stack.MyArrayStack;
import implementingInterfaces.stack.MyNodeStack;
import myInterfaces.MyMap;
import myInterfaces.MyList;
import myInterfaces.MyQueue;
import myInterfaces.MyStack;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyArrayList<>();
        MyList<Integer> linkedList = new MyLinkedList<>();

        MyMap<Integer, String> hashMap = new MyHashMap<>();

        MyQueue<Integer> nodeQueue = new MyNodeQueue<>();
        MyQueue<Integer> arrayQueue = new MyArrayQueue<>();

        MyStack<Integer> arrayStack = new MyArrayStack<>();
        MyStack<Integer> nodeStack = new MyNodeStack<>();

    }
}