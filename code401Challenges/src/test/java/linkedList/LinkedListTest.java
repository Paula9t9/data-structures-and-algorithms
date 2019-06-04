package linkedList;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert_singleAdd() {
        LinkedList list = new LinkedList();

        list.insert(2);

        assertEquals("Returned node list should have the expected nodes",
                2, list.getListOfNodes().get(0).value);

        //Leaving print in for now to make sure we don't have more values than were added
        // Goal is to eventually make a proper .equals override for comparing node ArrayLists
        ArrayList<Node> nodeList = list.getListOfNodes();

        System.out.println("Testing single insert. Should have one value." +
                "\nValue found in list: ");
        for(Node node : nodeList){
            System.out.println(node.value);
        }

    }

    // Tests that multiple values were properly added, and ensures that print properly returned an arrayList
    // containing everything
    @Test
    public void testInsert_multipleAdd() {
        LinkedList list = new LinkedList();

        list.insert(2);
        list.insert(8);
        list.insert(4);

        assertEquals("Returned node list should have the expected values",
                4, list.getListOfNodes().get(0).value);
        assertEquals("Returned node list should have the expected values",
                8, list.getListOfNodes().get(1).value);
        assertEquals("Returned node list should have the expected values",
                2, list.getListOfNodes().get(2).value);

        //Leaving print in for now to make sure we don't have more values than were added
        // Goal is to eventually make a proper .equals override for comparing node ArrayLists
        System.out.println(list.printValues());

    }


    @Test
    public void testIncludes_basic(){

        LinkedList testList = new LinkedList();
        testList.insert(7);
        testList.insert(8);
        testList.insert(2);
        testList.insert(3);

        assertTrue("Should return true when the item is in the list", testList.includes(7));
        assertFalse("Should return false when the value is not in the list", testList.includes(4));

    }



    @Test
    public void testEmptyList(){

        LinkedList testList = new LinkedList();
        assertEquals("List should instantiate as empty", null, testList.head);
    }

    @Test
    public void testHead(){

        LinkedList testList = new LinkedList();
        testList.insert(7);
        testList.insert(8);
        testList.insert(2);
        testList.insert(3);

        // Don't forget: most recent add is inserted at front of list
        assertEquals("Head should point to first item in the list",
                3, testList.head.value);

    }




}

