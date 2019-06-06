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
        System.out.println("Testing Multiple inserts. Should have 3 values.");
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


    @Test
    public void testInsertBefore(){
        LinkedList testList = new LinkedList();
        testList.insert(7);
        testList.insert(8);
        testList.insert(2);
        testList.insert(3);

        int valueToFind = 8;
        int valueToInsert = 4;

        testList.insertBefore(valueToFind, valueToInsert);
        ArrayList<Node> actualResult = testList.getListOfNodes();

        LinkedList expectedList = new LinkedList();
        expectedList.insert(7);
        expectedList.insert(8);
        expectedList.insert(4);
        expectedList.insert(2);
        expectedList.insert(3);

        ArrayList<Node> expectedResult = expectedList.getListOfNodes();

        assertEquals("Lists should be the same", expectedResult, actualResult);

    }


    @Test
    public void testAppend() {
        LinkedList testList = new LinkedList();
        testList.insert(7);
        testList.insert(8);
        testList.insert(2);
        testList.insert(3);

        int valueToInsert = 5;
        testList.append(valueToInsert);

        ArrayList<Node> actualResult = testList.getListOfNodes();

        LinkedList expectedList = new LinkedList();
        expectedList.insert(5);
        expectedList.insert(7);
        expectedList.insert(8);
        expectedList.insert(2);
        expectedList.insert(3);

        ArrayList<Node> expectedResult = expectedList.getListOfNodes();

        assertEquals("Lists should be the same. ", expectedResult, actualResult);
    }

    //TODO: test append on an empty list


    @Test
    public void testInsertAfter(){
        LinkedList testList = new LinkedList();
        testList.insert(7);
        testList.insert(8);
        testList.insert(2);
        testList.insert(3);

        int valueToFind = 8;
        int valueToInsert = 4;

        testList.insertAfter(valueToFind, valueToInsert);
        ArrayList<Node> actualResult = testList.getListOfNodes();

        LinkedList expectedList = new LinkedList();
        expectedList.insert(7);
        expectedList.insert(4);
        expectedList.insert(8);
        expectedList.insert(2);
        expectedList.insert(3);

        ArrayList<Node> expectedResult = expectedList.getListOfNodes();

        assertEquals("Lists should be the same", expectedResult, actualResult);
    }

    @Test
    public void testFindFromEnd_basicTest(){
        LinkedList testList = new LinkedList();
        testList.insert(7);
        testList.insert(8);
        testList.insert(2);
        testList.insert(3);

        assertEquals("Should find the value 2 spots from the end", 2, testList.findFromEnd(2));
    }


    @Test
    public void testMerge_basic(){
        LinkedList testList = new LinkedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);

        LinkedList testList2 = new LinkedList();
        testList2.insert(5);
        testList2.insert(6);
        testList2.insert(7);
        testList2.insert(8);

        LinkedList expectedList = new LinkedList();
        expectedList.insert(5);
        expectedList.insert(1);
        expectedList.insert(6);
        expectedList.insert(2);
        expectedList.insert(7);
        expectedList.insert(3);
        expectedList.insert(8);
        expectedList.insert(4);

        ArrayList<Node> expectedResult = expectedList.getListOfNodes();
        testList = testList.merge(testList2);
        ArrayList<Node> actualResult = testList.getListOfNodes();

        assertEquals("Should zip the two lists together", expectedResult, actualResult);
    }


    @Test
    public void testMerge_list1Longer(){
        LinkedList testList = new LinkedList();
        testList.insert(9);
        testList.insert(10);
        testList.insert(11);
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        testList.insert(4);


        LinkedList testList2 = new LinkedList();
        testList2.insert(5);
        testList2.insert(6);
        testList2.insert(7);
        testList2.insert(8);

        LinkedList expectedList = new LinkedList();
        expectedList.insert(9);
        expectedList.insert(10);
        expectedList.insert(11);
        expectedList.insert(5);
        expectedList.insert(1);
        expectedList.insert(6);
        expectedList.insert(2);
        expectedList.insert(7);
        expectedList.insert(3);
        expectedList.insert(8);
        expectedList.insert(4);


        ArrayList<Node> expectedResult = expectedList.getListOfNodes();
        testList = testList.merge(testList2);
        ArrayList<Node> actualResult = testList.getListOfNodes();

        assertEquals("Should zip the two lists together even if first list is longer",
                expectedResult, actualResult);

    }

    @Test
    public void testMerge_list2Longer(){
        LinkedList testList = new LinkedList();
        testList.insert(4);
        testList.insert(3);
        testList.insert(2);
        testList.insert(1);


        LinkedList testList2 = new LinkedList();
        testList.insert(11);
        testList.insert(10);
        testList.insert(9);
        testList2.insert(8);
        testList2.insert(7);
        testList2.insert(6);
        testList2.insert(5);

        LinkedList expectedList = new LinkedList();
        expectedList.insert(4);
        expectedList.insert(3);
        expectedList.insert(2);
        expectedList.insert(8);
        expectedList.insert(1);
        expectedList.insert(7);
        expectedList.insert(11);
        expectedList.insert(6);
        expectedList.insert(10);
        expectedList.insert(5);
        expectedList.insert(9);


        ArrayList<Node> expectedResult = expectedList.getListOfNodes();
        testList = testList.merge(testList2);
        ArrayList<Node> actualResult = testList.getListOfNodes();

        assertEquals("Should zip the two lists together even if second list is longer",
                expectedResult, actualResult);
    }
}


