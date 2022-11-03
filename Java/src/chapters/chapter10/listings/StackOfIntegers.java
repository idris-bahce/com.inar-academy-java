package chapters.chapter10.listings;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_SIZE = 16;

    public StackOfIntegers() {
        this(DEFAULT_SIZE);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return (size == 0);
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;
    }
    public int pop(){
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
