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
        BinaryTree testTree = new BinaryTree();
        ArrayList<Integer> insertValues = new ArrayList();
        insertValues.add(1);
        insertValues.add(2);
        insertValues.add(3);
        insertValues.add(4);
        insertValues.add(5);

        testTree.addValues(insertValues);
    }




    @Test
    public void testToString(){
        assertEquals("Should print the values in the tree", "This tree contains the values: 12345",
                testTree.toString());
    }

}