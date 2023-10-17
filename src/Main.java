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
        //комментируйте методы перед проверкой;)
        testArrayList();
        testLinkedList();
        testArrayQueue();
        testNodeQueue();
        testArrayStack();
        testNodeStack();
        testHashMap();
    }

    private static void testHashMap() {
        MyMap<Integer, String> map = new MyHashMap<>();
        System.out.println("заполняем таблицу...");
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        System.out.println("размер массива - " + map.size());
        System.out.println("выводим поочередно элементы из таблицы:");
        for (int i = 1; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }
        map.remove(1);
        System.out.println("удаляем пару с ключем 1...");
        System.out.println("новый размер таблицы - " + map.size());
        System.out.println("выводим поочередно элементы из таблицы после удаления элемента с индексом 1:");
        for (int i = 2; i <= map.size(); i++) {
            System.out.println(map.get(i));
        }
        System.out.println("очищаем массив...");
        map.clear();
        System.out.println("новый размер массива - " + map.size());
        System.out.println("добавляем два ключа с одинаковыми значениями...");
        map.put(0, "a");
        map.put(0, "a");
        System.out.println("новый размер массива - " + map.size());
        System.out.println("выводим поочередно элементы из таблицы:");
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
    }

    private static void testNodeStack() {
        MyStack<Integer> nodeStack = new MyNodeStack<>();
        System.out.println("заполняем массив...");
        nodeStack.push(1);
        nodeStack.push(2);
        nodeStack.push(3);
        nodeStack.push(4);
        nodeStack.push(5);
        System.out.println("размер массива - " + nodeStack.size());
        System.out.println("проверяем метод peek...");
        for (int i = 0; i < nodeStack.size(); i++) {
            System.out.println(nodeStack.peek());
        }
        System.out.println("размер массива - " + nodeStack.size());
        nodeStack.remove(0);
        System.out.println("удаляем элемент с индексом 0...");
        System.out.println("размер массива - " + nodeStack.size());
        System.out.println("проверяем метод pop...");
        while (nodeStack.size() > 0) {
            System.out.println(nodeStack.pop());
        }
        System.out.println("размер массива - " + nodeStack.size());
        System.out.println("добавляем элемент в массив...");
        nodeStack.push(1);
        System.out.println("размер массива - " + nodeStack.size());
        System.out.println("очищаем массив...");
        nodeStack.clear();
        System.out.println("новый размер массива - " + nodeStack.size());
    }

    private static void testArrayStack() {
        MyStack<Integer> arrayStack = new MyArrayStack<>();
        System.out.println("заполняем массив...");
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        System.out.println("размер массива - " + arrayStack.size());
        System.out.println("проверяем метод peek...");
        for (int i = 0; i < arrayStack.size(); i++) {
            System.out.println(arrayStack.peek());
        }
        System.out.println("размер массива - " + arrayStack.size());
        arrayStack.remove(0);
        System.out.println("удаляем элемент с индексом 0...");
        System.out.println("размер массива - " + arrayStack.size());
        System.out.println("проверяем метод pop...");
        while (arrayStack.size() > 0) {
            System.out.println(arrayStack.pop());
        }
        System.out.println("размер массива - " + arrayStack.size());
        System.out.println("добавляем элемент в массив...");
        arrayStack.push(1);
        System.out.println("размер массива - " + arrayStack.size());
        System.out.println("очищаем массив...");
        arrayStack.clear();
        System.out.println("новый размер массива - " + arrayStack.size());
    }

    private static void testNodeQueue() {
        MyQueue<Integer> nodeQueue = new MyNodeQueue<>();
        System.out.println("заполняем массив...");
        nodeQueue.add(1);
        nodeQueue.add(2);
        nodeQueue.add(3);
        nodeQueue.add(4);
        nodeQueue.add(5);
        System.out.println("размер массива - " + nodeQueue.size());
        System.out.println("проверяем метод peek...");
        for (int i = 0; i < nodeQueue.size(); i++) {
            System.out.println(nodeQueue.peek());
        }
        System.out.println("размер массива - " + nodeQueue.size());
        System.out.println("проверяем метод poll...");
        while (nodeQueue.size() > 0) {
            System.out.println(nodeQueue.poll());
        }
        System.out.println("размер массива - " + nodeQueue.size());
        System.out.println("добавляем элемент в массив...");
        nodeQueue.add(1);
        System.out.println("размер массива - " + nodeQueue.size());
        System.out.println("очищаем массив...");
        nodeQueue.clear();
        System.out.println("новый размер массива - " + nodeQueue.size());

    }

    private static void testArrayQueue() {
        MyQueue<Integer> arrayQueue = new MyArrayQueue<>();
        System.out.println("заполняем массив...");
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);
        arrayQueue.add(4);
        arrayQueue.add(5);
        System.out.println("размер массива - " + arrayQueue.size());
        System.out.println("проверяем метод peek...");
        for (int i = 0; i < arrayQueue.size(); i++) {
            System.out.println(arrayQueue.peek());
        }
        System.out.println("размер массива - " + arrayQueue.size());
        System.out.println("проверяем метод poll...");
        while (arrayQueue.size() > 0) {
            System.out.println(arrayQueue.poll());
        }
        System.out.println("размер массива - " + arrayQueue.size());
        System.out.println("добавляем элемент в массив...");
        arrayQueue.add(1);
        System.out.println("размер массива - " + arrayQueue.size());
        System.out.println("очищаем массив...");
        arrayQueue.clear();
        System.out.println("новый размер массива - " + arrayQueue.size());

    }

    private static void testLinkedList() {
        MyList<Integer> arrayList = new MyLinkedList<>();
        System.out.println("заполняем массив...");
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("размер массива - " + arrayList.size());
        System.out.println("выводим поочередно элементы из массива:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(0);
        System.out.println("удаляем элемент с индексом 0...");
        System.out.println("новый размер массива - " + arrayList.size());
        System.out.println("выводим поочередно элементы из массива после удаления элемента с индексом 0:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("очищаем массив...");
        arrayList.clear();
        System.out.println("новый размер массива - " + arrayList.size());
    }

    private static void testArrayList() {
        MyList<Integer> arrayList = new MyArrayList<>();
        System.out.println("заполняем массив...");
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("размер массива - " + arrayList.size());
        System.out.println("выводим поочередно элементы из массива:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(0);
        System.out.println("удаляем элемент с индексом 0...");
        System.out.println("новый размер массива - " + arrayList.size());
        System.out.println("выводим поочередно элементы из массива после удаления элемента с индексом 0:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("очищаем массив");
        arrayList.clear();
        System.out.println("новый размер массива - " + arrayList.size());
    }
}