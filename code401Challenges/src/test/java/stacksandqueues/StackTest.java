package stacksandqueues;

import linkedList.LinkedList;
import linkedList.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StackTest {

    Stack stackToTest;
    LinkedList expectedList;


    @Before
    public void initializeStack(){
        stackToTest = new Stack();
        stackToTest.push(1);
        stackToTest.push(2);
        stackToTest.push(3);
        stackToTest.push(4);


        expectedList = new LinkedList();
        expectedList.insert(1);
        expectedList.insert(2);
        expectedList.insert(3);
        expectedList.insert(4);


    }

    @Test
    public void testGetStackNodes() {

        assertEquals("Should return a list of the expected Nodes", expectedList.getListOfNodes(),
                stackToTest.getStackNodes());

    }

    @Test
    public void testSinglePush() {

        stackToTest.push(5);
        expectedList.insert(5);

        assertEquals("Should properly add a single value", expectedList.getListOfNodes(),
                stackToTest.getStackNodes());
    }

    @Test
    public void testSinglePop() {
        stackToTest.push(5);

        assertEquals("Should return the most recently added value", 5, stackToTest.pop() );
        assertEquals("Removed value should no longer be on the stack", expectedList.getListOfNodes(),
                stackToTest.getStackNodes());
    }

    @Test
    public void testMultiplePop(){
        stackToTest.push(5);
        stackToTest.push(6);
        stackToTest.push(7);

        assertEquals("Should return the most recently added value", 7, stackToTest.pop());
        assertEquals("Should return the most recently added value", 6, stackToTest.pop());
        assertEquals("Should return the most recently added value", 5, stackToTest.pop());

        assertEquals("Removed values should no longer be on the stack", expectedList.getListOfNodes(),
                stackToTest.getStackNodes());
    }

    @Test
    public void testPeek(){

        assertEquals("Should return the top value from the stack", 4, stackToTest.peek());
        assertEquals("Should not remove value from the stack", expectedList.getListOfNodes(),
                stackToTest.getStackNodes());

    }

}