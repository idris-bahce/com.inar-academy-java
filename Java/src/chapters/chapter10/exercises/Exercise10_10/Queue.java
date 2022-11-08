package chapters.chapter10.exercises.Exercise10_10;

public class Queue {
    private int[] elements = new int[8];
    private int size;

    public Queue() {
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int result = 0;
        if (elements[0] != 0) {
            result = elements[0];
            size--;
        }
        for (int i = 0; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        return result;
    }

    public boolean empty() {
        return elements[0] == 0;
    }
}
