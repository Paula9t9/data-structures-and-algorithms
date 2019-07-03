package quickSort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    int[] testArray;
    int[] expectedArray;


    @Before
    public void setUp() throws Exception {
        testArray = new int[]{7, 2, 4, 3};
        expectedArray = new int[]{2, 3, 4, 7};
    }

    @Test
    public void quickSort() {
        assertArrayEquals("Array should be sorted", expectedArray, QuickSort.quickSort(testArray, 0,
                testArray.length - 1));
    }
}