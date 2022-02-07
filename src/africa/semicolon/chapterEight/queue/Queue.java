package africa.semicolon.chapterEight.queue;

public class Queue {
    private int capacity;
    private int[] elements;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements=new int[capacity];
    }

    public int[] getElements() {
        return elements;
    }

    public void enqueue(int v) {
        for (int i = 0; i < elements.length; ) {
            if (elements[i] != 0){
                i++;
            }
            else if (elements[i] == 0){
                elements[i] = v;
                break;
            }
        }
    }
    public boolean empty() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[0] == 0) return true;
        }
        return false;
    }

    public int getSize() {
        return capacity;
    }

    public void dequeue() {
    }
}
