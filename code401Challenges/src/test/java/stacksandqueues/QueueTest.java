package stacksandqueues;

import linkedList.LinkedList;
import linkedList.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    Queue testQueue;
    LinkedList expectedList;

    @Before
    public void setUp() {
        testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.enqueue(4);

        expectedList = new LinkedList();
        expectedList.insert(4);
        expectedList.insert(3);
        expectedList.insert(2);
        expectedList.insert(1);
    }

    @Test
    public void testEnqueue_correctValue(){
        Node testNode = testQueue.enqueue(5);

        assertEquals("Should add the correct value to the new node", 5,
                testNode.getValue());
    }

    @Test
    public void testEnqueue_basic() {

        assertEquals("Should properly add items to the queue",
                expectedList.getListOfNodes(), testQueue.getQueueNodes());
    }

    @Test
    public void testDequeue_basic() {
        //Re-initialize with one less value for test
        expectedList = new LinkedList();
        expectedList.insert(4);
        expectedList.insert(3);
        expectedList.insert(2);

        int removedValue = testQueue.dequeue();

        assertEquals("Should remove the correct value to the new node", 1,
                removedValue);
        assertEquals("Should remove the front item from the list", expectedList.getListOfNodes(),
                testQueue.getQueueNodes());
    }
}