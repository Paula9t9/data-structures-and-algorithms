package leftJoin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    ArrayList expectedList;
    HashMap<String, String> leftInput;
    HashMap<String, String> rightInput;
    HashMap<String, String> emptyMap;


    @Before
    public void setUp() throws Exception {

        expectedList = new ArrayList();

        String[] rowOne = {"fond", "enamored", "averse"};
        String[] rowTwo = {"wrath", "anger", "delight"};
        String[] rowThree = {"outfit", "garb", null};

        expectedList.add(rowThree);
        expectedList.add(rowTwo);
        expectedList.add(rowOne);

        leftInput = new HashMap<>();
        leftInput.put("outfit", "garb");
        leftInput.put("wrath", "anger");
        leftInput.put("fond", "enamored");



        rightInput = new HashMap<>();
        rightInput.put("flow", "jam");
        rightInput.put("wrath", "delight");
        rightInput.put("fond", "averse");


        emptyMap = new HashMap<>();
    }


    @Test
    public void testLeftJoin_BasicJoin() {

        ArrayList resultList = LeftJoin.leftJoin(leftInput, rightInput);


        assertArrayEquals("Should join keys into left map", expectedList.toArray(), resultList.toArray());

    }

    @Test
    public void testLeftJoin_EmptyRight() {

        ArrayList resultList = LeftJoin.leftJoin(leftInput, emptyMap);

        expectedList = new ArrayList();

        String[] rowOne = {"fond", "enamored", null};
        String[] rowTwo = {"wrath", "anger", null};
        String[] rowThree = {"outfit", "garb", null};

        expectedList.add(rowThree);
        expectedList.add(rowTwo);
        expectedList.add(rowOne);

        assertArrayEquals("Should join keys into left map", expectedList.toArray(), resultList.toArray());


    }

    @Test
    public void testLeftJoin_EmptyLeft() {

        ArrayList resultList = LeftJoin.leftJoin(emptyMap, rightInput);

        expectedList = new ArrayList();


        assertArrayEquals("Should join keys into left map", expectedList.toArray(), resultList.toArray());


    }

}