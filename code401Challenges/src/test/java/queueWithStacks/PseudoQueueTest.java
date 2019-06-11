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
    public void enqueue() {

        assertEquals("Values should be properly added", expectedList.getListOfNodes(),
                testQ.getPsuedoQueueNodes());
    }
    

    @Test
    public void dequeue() {

        expectedList = new LinkedList();
        expectedList.insert(2);
        expectedList.insert(3);
        expectedList.insert(4);
        expectedList.insert(5);

        assertEquals("Should remove the first value added to the queue", 1, testQ.dequeue());
        assertEquals("Value should no longer be in the queue", expectedList.getListOfNodes(),
                testQ.getPsuedoQueueNodes());
    }
}