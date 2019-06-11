package queueWithStacks;

import linkedList.LinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    PseudoQueue testQ;
    LinkedList expectedList;

    @Before
    public void setUp() {
        testQ = new PseudoQueue();
        testQ.enqueue(1);
        testQ.enqueue(2);
        testQ.enqueue(3);
        testQ.enqueue(4);
        testQ.enqueue(5);

        expectedList = new LinkedList();
        expectedList.insert(1);
        expectedList.insert(2);
        expectedList.insert(3);
        expectedList.insert(4);
        expectedList.insert(5);
    }

    @Test
    public void testEnqueue_basic() {

        assertEquals("Values should be properly added", expectedList.getListOfNodes(),
                testQ.getPsuedoQueueNodes());
    }


    @Test
    public void testDequeue_basic() {

        expectedList = new LinkedList();
        expectedList.insert(2);
        expectedList.insert(3);
        expectedList.insert(4);
        expectedList.insert(5);

        assertEquals("Should remove the first value added to the queue", 1, testQ.dequeue());
        assertEquals("Value should no longer be in the queue", expectedList.getListOfNodes(),
                testQ.getPsuedoQueueNodes());
    }

    @Test
    public void testEnQAndDeQ(){

        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();

        testQ.enqueue(6);
        testQ.enqueue(7);
        testQ.enqueue(8);
        testQ.enqueue(9);
        testQ.enqueue(10);

        expectedList = new LinkedList();
        expectedList.insert(6);
        expectedList.insert(7);
        expectedList.insert(8);
        expectedList.insert(9);
        expectedList.insert(10);

        assertEquals("Should properly remove all values and add new values", expectedList.getListOfNodes(),
                testQ.getPsuedoQueueNodes());
    }

    @Test
    public void testEnQAndDeQ_halfEmpty(){

        testQ.dequeue();
        testQ.dequeue();
        testQ.dequeue();

        testQ.enqueue(6);
        testQ.enqueue(7);
        testQ.enqueue(8);
        testQ.enqueue(9);
        testQ.enqueue(10);

        expectedList = new LinkedList();
        expectedList.insert(4);
        expectedList.insert(5);
        expectedList.insert(6);
        expectedList.insert(7);
        expectedList.insert(8);
        expectedList.insert(9);
        expectedList.insert(10);

        assertEquals("Should properly add new values even after some values have been removed",
                expectedList.getListOfNodes(),
                testQ.getPsuedoQueueNodes());
    }
}