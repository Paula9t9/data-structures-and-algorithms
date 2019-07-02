package mergeSort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    int[] testArray;
    int[] expectedArray;
    int[] subArrayLeft;
    int[] subArrayRight;

    @Before
    public void setUp() throws Exception {
        testArray = new int[]{7, 2, 4, 3};
        expectedArray = new int[]{2, 3, 4, 7};
        subArrayLeft = new int[]{2,7};
        subArrayRight = new int[]{3,4};
    }

    @Test
    public void mergeSort() {
        assertArrayEquals("Array should be sorted", expectedArray, MergeSort.mergeSort(testArray));
    }

    @Test
    public void merge() {
        assertArrayEquals("Arrays should be merged and sorted", expectedArray, MergeSort.merge(
                subArrayLeft, subArrayRight, testArray));
    }
}