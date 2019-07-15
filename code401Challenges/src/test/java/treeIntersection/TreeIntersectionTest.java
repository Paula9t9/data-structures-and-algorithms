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

    @Test
    public void testTreeIntersection_noDuplicates() {

        BinaryTree tree3 = new BinaryTree();
        tree3.addSingleValue(1);
        tree3.addSingleValue(888);
        tree3.addSingleValue(777);
        tree3.addSingleValue(44);
        tree3.addSingleValue(66);
        tree3.addSingleValue(55);

        ArrayList expectedArray = new ArrayList();
        ArrayList actualList = TreeIntersection.treeIntersection(tree3, tree);

        assertTrue("Should not find any matches if there are none",
                expectedArray.equals(actualList));

    }

    @Test
    public void testTree_Empty() {

        ArrayList expectedArray = new ArrayList();
        BinaryTree emptyTree = new BinaryTree();

        assertTrue("Should not find anything if only pass one actual list",
                expectedArray.equals(TreeIntersection.treeIntersection(emptyTree, tree)));
    }
}