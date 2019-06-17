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
        insertValues.add(1);
        insertValues.add(2);
        insertValues.add(3);
        insertValues.add(4);
        insertValues.add(5);

        testTree.addValues(insertValues);
    }


    @Test
    public void testToString(){
        // currently ToString's from the bottom up
        assertEquals("Should print the values in the tree", "This tree contains the values: 54321",
                testTree.toString());
    }

}