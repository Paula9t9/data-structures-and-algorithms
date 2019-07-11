package treeIntersection;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    BinaryTree tree;
    BinaryTree tree2;

    @Before
    public void setUp() throws Exception {
        tree = new BinaryTree();
        tree.addSingleValue(2);
        tree.addSingleValue(5);
        tree.addSingleValue(7);
        tree.addSingleValue(8);
        tree.addSingleValue(222);
        tree.addSingleValue(31);

        tree2 = new BinaryTree();
        tree2.addSingleValue(6);
        tree2.addSingleValue(22);
        tree2.addSingleValue(5);
        tree2.addSingleValue(33);
        tree2.addSingleValue(7);
        tree2.addSingleValue(8);

    }

    @Test
    public void treeIntersection() {

        ArrayList expectedArray = new ArrayList();
        expectedArray.add(5);
        expectedArray.add(7);
        expectedArray.add(8);

        ArrayList actualList = TreeIntersection.treeIntersection(tree, tree2);

        Collections.sort(expectedArray);
        Collections.sort(actualList);

        assertTrue("Should contain values found in both trees", expectedArray.equals(actualList));

    }
}