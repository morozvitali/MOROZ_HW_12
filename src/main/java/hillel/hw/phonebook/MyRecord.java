package src.main.java.hillel.hw.phonebook;

import java.util.ArrayList;
public class MyRecord {
    public String name;
    public ArrayList<String> numberList = new ArrayList<>();
    public MyRecord (String name, String number) {
        this.name = name;
        numberList.add (number);
    }

    @Override
    public String toString() {
        return "Запис у книжці: " +
                "Iм'я: " + name + " Номер телефону: " + numberList.toString();
    }
}

