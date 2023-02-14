package src.main.java.hillel.hw.occurance;

import java.util.ArrayList;

public class ToListConverter2 {
//2
         public static ArrayList toList(int [] array) {
            ArrayList <Integer> arrayList = new ArrayList();
            for (int value : array) {
                arrayList.add(value);
            }
            return arrayList;
        }
}
