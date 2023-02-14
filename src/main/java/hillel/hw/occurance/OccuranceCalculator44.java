package src.main.java.hillel.hw.occurance;

import java.util.ArrayList;
import java.util.HashMap;

public class OccuranceCalculator44 {
//4 **
    public static void calcOccurance(ArrayList<String> arrayList) {

       HashMap dataResult = new HashMap<>();



        for (int i = 0; i < arrayList.size(); i++) {
            int counter = 0;
            for (int a = 0; a < arrayList.size(); a++) {
                if (arrayList.get(i).contains(arrayList.get(a))) {
                    counter++;
                }
            }

            String value = arrayList.get(i);
            dataResult.put(value, counter);
        }
        System.out.println(dataResult);
    }

    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("dog");
        arrayList.add("dog");
        arrayList.add("dog");
        arrayList.add("dog");
        arrayList.add("dog");
        arrayList.add("fox");
        arrayList.add("fox");
        arrayList.add("fox");
        arrayList.add("dog");
        arrayList.add("dog");
        arrayList.add("dog");
        arrayList.add("dog");

        calcOccurance (arrayList);
    }
}
