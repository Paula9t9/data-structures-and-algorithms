package insertionSort;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    int[] testArray;
    int[] expectedArray;

    @Before
    public void setUp() throws Exception {
        testArray = new int[]{7, 2, 4, 3};
        expectedArray = new int[]{2, 3, 4, 7};
    }

    @Test
    public void insertionSort() {

        InsertionSort.insertionSort(testArray);

        assertArrayEquals("Array should be sorted from smallest to largest", expectedArray,
                testArray);
    }
}