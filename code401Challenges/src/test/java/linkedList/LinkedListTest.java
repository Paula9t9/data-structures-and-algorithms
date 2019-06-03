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
                2, list.print().get(0).value);

        ArrayList<Node> nodeList = list.print();

        System.out.println("Values found in list: ");
        for(Node node : nodeList){
            System.out.println(node.value);
        }

    }

    @Test
    public void testInsert_multipleAdd() {
        LinkedList list = new LinkedList();

        list.insert(2);
        list.insert(8);
        list.insert(4);

        assertEquals("Returned node list should have the expected values",
                4, list.print().get(0).value);
        assertEquals("Returned node list should have the expected values",
                8, list.print().get(1).value);
        assertEquals("Returned node list should have the expected values",
                2, list.print().get(2).value);

        ArrayList<Node> nodeList = list.print();

        System.out.println("Values found in list: ");
        for(Node node : nodeList){
            System.out.println(node.value);
        }

    }

}