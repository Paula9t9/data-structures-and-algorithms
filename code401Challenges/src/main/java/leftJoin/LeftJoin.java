package leftJoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LeftJoin {


    public static ArrayList leftJoin(HashMap<String, String> leftMap, HashMap<String, String> rightMap){

        ArrayList resultList = new ArrayList();

        //Used Geeks for Geeks to figure out how to iterate
        // https://www.geeksforgeeks.org/iterate-map-java/
        for(Map.Entry<String, String> entry : leftMap.entrySet()){

            String[] rowArray = new String[3];
            rowArray[0] = entry.getKey();
            rowArray[1] = entry.getValue();
            if(rightMap.containsKey(entry.getKey())){
                rowArray[2] = rightMap.get(entry.getKey());
            }else{
                rowArray[2] = null;
            }

            resultList.add(rowArray);
        }

        return resultList;
    }
}
