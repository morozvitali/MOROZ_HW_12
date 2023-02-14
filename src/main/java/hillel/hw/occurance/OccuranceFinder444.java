package src.main.java.hillel.hw.occurance;

import java.util.ArrayList;
import java.util.HashMap;

public class OccuranceFinder444 {

//4***
    public static HashMap findOccurance(ArrayList<String> arrayList) {

        HashMap dataResult = new HashMap<>();
        ArrayList<String> arrayListCopy = arrayList;
        for (int i = 0; i < arrayList.size(); i++) {
            int counter = 0;
            for (int a = 0; a < arrayList.size(); a++) {
                if (arrayListCopy.get(i).contains(arrayList.get(a))) {
                    counter++;
                }
            }

            String value = " name: " + arrayList.get(i);
            String key = "> occurrence: " + counter;
            dataResult.put(value, key);
        }
        return dataResult;
    }
}
