package africa.semicolon.chapterEight.queue;

public class Queue {
    private int capacity;
    private int[] elements;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements=new int[capacity];
    }

    public int[] getElements() {
        return elements;
    }

    public void enqueue(int v) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == 0){
                elements[i] = v;
            }
        }
    }
}
