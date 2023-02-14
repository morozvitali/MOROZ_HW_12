package src.main.java.hillel.hw.phonebook;

import java.util.ArrayList;

public class Phonebook {
    public ArrayList<MyRecord> phonebook = new ArrayList<>();
    public void add(String name, String number) {
        phonebook.add(new MyRecord (name,number));
    }

    @Override
    public String toString() {
        return "Телефонний довідник " +
                phonebook.toString() +
                '}';
    }

    public MyRecord find (String partName) {
        for (MyRecord rec : phonebook) {
            if (rec.name.contains(partName)) {
                return rec;
            }
        }
        return null;
    }

    public ArrayList <MyRecord> findAll (String partName) {
        ArrayList <MyRecord> findAllList = new ArrayList<>();
        for (MyRecord rec : phonebook) {
            if (rec.name.contains(partName)) {
                findAllList.add(rec);
            }
        }
        return findAllList;
    }

}