package africa.semicolon.chapterEight.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void testThatAListOfQueueElementsExist(){
        Queue queue = new Queue(8);
        int[] elements = queue.getElements();
        assertArrayEquals(new int[8], elements);
        assertEquals(8, elements.length);
    }

    @Test
    void testMethodEnqueue(){
        Queue queue = new Queue(8);
        int[] elements = queue.getElements();
        queue.enqueue(5);
        assertEquals(5, elements[0]);
    }


}