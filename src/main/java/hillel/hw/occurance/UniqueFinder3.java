package src.main.java.hillel.hw.occurance;

import java.util.ArrayList;
import java.util.Objects;

public class UniqueFinder3 {
    //3
    public static ArrayList<Integer> findUnique(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayListResult = new ArrayList<>();

        Outer :
        for (int i = 0; i < arrayList.size(); i++) {
            Inner :
            for (int a = 0; a < arrayList.size(); a++) {
                if (i == a) continue Inner;

                if (Objects.equals(arrayList.get(i), arrayList.get(a))) {
                    continue Outer;
                }
            }
           arrayListResult.add(arrayList.get(i));
        }
        return arrayListResult;
    }
}