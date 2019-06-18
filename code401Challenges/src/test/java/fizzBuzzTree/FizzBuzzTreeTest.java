package fizzBuzzTree;

import org.junit.Test;
import tree.BinaryTree;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTree() {
        BinaryTree testTree = new BinaryTree();
        ArrayList<Integer> insertValues = new ArrayList();
        insertValues.add(15);
        insertValues.add(2);
        insertValues.add(3);
        insertValues.add(5);
        insertValues.add(1);

        testTree.addValues(insertValues);

        FizzBuzzTree fizzBuzzTree = new FizzBuzzTree();
        fizzBuzzTree.fizzBuzzTree(testTree);

        String expectedValues = "This tree contains the values: 1BuzzFizz2FizzBuzz";

        assertEquals("Should convert values to FizzBuzz, Fizz, or Buzz if they are divisible by " +
                "(3 and 5), 3, or 5", expectedValues, testTree.toString());
    }
}