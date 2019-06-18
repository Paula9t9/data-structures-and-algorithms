package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    BinaryTree testTree;
    ArrayList<Integer> insertValues;

    @Before
    public void setUp() throws Exception {
        testTree = new BinaryTree();
        insertValues = new ArrayList();
        insertValues.add(4);
        insertValues.add(2);
        insertValues.add(3);
        insertValues.add(5);
        insertValues.add(1);

        testTree.addValues(insertValues);
    }


    @Test
    public void testToString(){
        // currently ToString's from the bottom up
        assertEquals("Should print the values in the tree", "This tree contains the values: 12354",
                testTree.toString());
    }

    @Test
    public void testPreOrderTraversal(){
        ArrayList<Integer> expectedArray = new ArrayList<>();
        expectedArray.add(4);
        expectedArray.add(2);
        expectedArray.add(1);
        expectedArray.add(3);
        expectedArray.add(5);

        ArrayList<Integer> actualArray = testTree.preOrderTraversal(testTree.getRoot());

        assertEquals("Should traverse the tree starting with the left nodes", expectedArray,
                actualArray);


    }

}