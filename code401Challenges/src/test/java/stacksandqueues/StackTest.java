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

    
}