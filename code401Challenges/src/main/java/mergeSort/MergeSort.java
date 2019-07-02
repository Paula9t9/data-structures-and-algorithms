package mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] array){
        int length = array.length;

        if ( length > 1){
            int mid = length / 2;
            //Get new array based on range:
            // https://stackoverflow.com/questions/11001720/get-only-part-of-an-array-in-java/11001759
            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid, length);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(leftArray, rightArray, array);

        }

        return array;
    }

    public static int[] merge(int[] leftArray, int[] rightArray, int[] originalArray){
        //indexes for left, right, and original arrays
        int i = 0;
        int j = 0;
        int k = 0;

        //check which item is smaller and add that item to the array
        while( i < leftArray.length && j < rightArray.length){
            if(leftArray[i] <= rightArray[j]){
                originalArray[k] = leftArray[i];
                i++;
            }else {
                originalArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //add the remaining items to the array
        if( i == leftArray.length){
            while(j < rightArray.length){
                originalArray[k] = rightArray[j];
                j++;
                k++;
            }
        }else {
            while(i < leftArray.length){
                originalArray[k] = leftArray[i];
                i++;
                k++;
            }
        }

        return originalArray;
    }
}
