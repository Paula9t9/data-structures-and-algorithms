package quickSort;

public class QuickSort {

    public static int[] quickSort(int[] array, int leftIndex, int rightIndex){
        if(leftIndex < rightIndex){
            int position = partition(array, leftIndex, rightIndex);
            quickSort(array, leftIndex, position - 1);
            quickSort(array, position + 1, rightIndex);
        }

        return array;
    }

    private static int partition(int[] array, int leftIndex, int rightIndex) {

        int pivot = array[rightIndex];
        int low = leftIndex - 1;

        for (int i = leftIndex; i < rightIndex; i++){
            if(array[i] <= pivot){
                low++;
                swap(array, i, low);
            }
        }


        swap(array, rightIndex, low + 1);

        low++;
        return low;
    }

    private static void swap(int[] array, int i, int low) {

        int temp;
        temp = array[i];
        array[i] = array[low];
        array[low] = temp;
    }



}
