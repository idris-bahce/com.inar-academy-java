package chapters.chapter10.exercises.Exercise10_05;

public class stackOfIntegers {
    private int[] elements;
    private int size;
    public final int DEFAULT_SIZE_OF_ARRAY = 10;

    public stackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }

    public stackOfIntegers() {
        this.elements = new int[DEFAULT_SIZE_OF_ARRAY];
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
        elements[size++]=value;
    }
    public int pop(){
        return elements[--size];
    }
    public int getSize() {
        return size;
    }
}
