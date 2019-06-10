package introChallenges;

public class BinarySearch {

    public int myBinarySearch(int[] array, int findNumber){
        int currentIndex = array.length /2;
        int minIndex = 0;
        int maxIndex = array.length -1;
        int foundAtIndex = -1;

        while(foundAtIndex == -1){
            if(array[currentIndex] == findNumber){
                foundAtIndex = currentIndex;
            }else if (findNumber > array[currentIndex]){
                minIndex = currentIndex;
                currentIndex = (minIndex + maxIndex) / 2;
            }else if (findNumber < array[currentIndex]){
                maxIndex = currentIndex;
                currentIndex = (minIndex + maxIndex) / 2;
            }

            if(currentIndex == minIndex || currentIndex == maxIndex){
                break;
            }
        }


        return foundAtIndex;
    }
}
