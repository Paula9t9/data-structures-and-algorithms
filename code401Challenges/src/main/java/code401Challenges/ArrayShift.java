package code401Challenges;

public class ArrayShift {

    public int[] insertShiftArray (int[] inputArray, int numberToBeInserted){
        int[] newArray = new int[inputArray.length + 1];
        //Math.ceil doesn't properly round up. Have to manually round using one of these methods:
        // https://stackoverflow.com/questions/7139382/java-rounding-up-to-an-int-using-math-ceil
        int halfwayPoint = (inputArray.length / 2) + ((inputArray.length % 2 == 0) ? 0 : 1);

        for (int i = 0; i < newArray.length; i++){

            if( i == halfwayPoint ){
                newArray[i] = numberToBeInserted;
            }else if ( i > halfwayPoint ){
                newArray[i] = inputArray[i-1];
            }else {
                newArray[i] = inputArray[i];
            }
        }


        return newArray;
    }
}
