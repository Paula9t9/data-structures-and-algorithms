package code401Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearch_basicTest() {
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        int findNumber = 4;
        int expectedResult = 3;
        assertEquals("Should return the index where the number was found",
                expectedResult, binarySearch.myBinarySearch(inputArray, findNumber));

    }

    @Test 
}