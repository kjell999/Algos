// Хэш-таблица на Java
import java.util.HashMap;
HashMap<String, Integer> hashMap = new HashMap<>();
// Бинарная куча
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BinaryHeap<T extends Comparable<T>> {
    private List<T> heap;
    
    public BinaryHeap() {
        this.heap = new ArrayList<>();
    }
    
    public BinaryHeap(int capacity) {
        this.heap = new ArrayList<>(capacity);
    }
    
    public BinaryHeap(T[] array) {
        this.heap = new ArrayList<>();
        for (T item : array) {
            heap.add(item);
        }
        buildHeap();
    }
    
// Биномальная куча

public class BinomialHeap {
    private BinomialHeapNode head;

    public BinomialHeap() {
        head = null;
    }
    
// Куча Фибоначчи

public class FibonacciHeap {
    private FibonacciHeapNode minNode;
    private int size;
    
    public FibonacciHeap() {
        this.minNode = null;
        this.size = 0;
    }