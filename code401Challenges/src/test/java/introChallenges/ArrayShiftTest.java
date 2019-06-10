package introChallenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test public void testInsertShiftArray(){
        ArrayShift classUnderTest = new ArrayShift();
        int[] inputArray = new int[]{1, 2, 3, 4};
        int inputNumber = 9;
        int[] expectedOutput = new int[]{1, 2, 9, 3, 4};
        assertArrayEquals("Number should insert in middle of array",
                expectedOutput, classUnderTest.insertShiftArray(inputArray,inputNumber));
    }

    @Test public void testInsertShiftArray_OddLength(){
        ArrayShift arrayShiftInstance = new ArrayShift();
        int[] inputArray = new int[]{1, 2, 3, 4, 5};
        int inputNumber = 9;
        int[] expectedOutput = new int[]{1, 2, 3, 9, 4, 5};
        assertArrayEquals("When odd, needs to insert number after the middle number",
                expectedOutput, arrayShiftInstance.insertShiftArray(inputArray, inputNumber));
    }
}
