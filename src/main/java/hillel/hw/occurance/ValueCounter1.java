package src.main.java.hillel.hw.occurance;

import java.util.ArrayList;

public class ValueCounter1 {
//1
    public static int countOccurance (ArrayList <String> aList, String str) {
        int counter = 0;
        for (String el : aList) {
            if (el.equals(str)) {
                counter++;
            }
        }
        return counter;
    }
}
