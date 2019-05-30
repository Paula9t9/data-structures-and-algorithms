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
    public void testBinarySearch_testEvenArray(){
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int findNumber = 2;
        int firstExpectedResult = 1;

        assertEquals("Should return index for found number",
                firstExpectedResult, binarySearch.myBinarySearch(inputArray, findNumber));

        int findSecondNumber = 3;
        int secondExpectedResult = 2;
        assertEquals("Should return the index where the number was found",
                secondExpectedResult, binarySearch.myBinarySearch(inputArray,findSecondNumber));

    }

    @Test
    public void testBinarySearch_testGapArray(){
        BinarySearch binarySearch = new BinarySearch();
        int[] inputArray = new int[]{1, 3, 4, 5, 6, 9, 22, 33};
        int findNumber = 9;
        int expectedResult = 5;

        assertEquals("Should return the index where the number was found\"r",
                expectedResult, binarySearch.myBinarySearch(inputArray, findNumber));

    }
}