package src.main.java.hillel.hw.occurance;

import java.util.ArrayList;
import src.main.java.hillel.hw.phonebook.*;


public class ApplicationOccurance {



    public static void main(String[] args) {


        System.out.println("1ша частина");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("hi");
        arrayList1.add("hi");
        arrayList1.add("hi");
        arrayList1.add("hi");
        arrayList1.add("hi");
        arrayList1.add("hi");
        arrayList1.add("hello");
        arrayList1.add("hi");
        arrayList1.add("hello");
        arrayList1.add("hi");
        arrayList1.add("hello");
        arrayList1.add("bye");
        System.out.println(ValueCounter1.countOccurance (arrayList1, "hi"));


        //2
        System.out.println("2га частина");
        int [ ] array2 = new int [] {11,22,33,55,777,4434};
        ArrayList arrayList2 = ToListConverter2.toList (array2);
        System.out.println(arrayList2);

        //3
        System.out.println("3я частина");
        ArrayList <Integer> arrayList3 = new ArrayList();
        arrayList3.add(11);
        arrayList3.add(12);
        arrayList3.add(13);
        arrayList3.add(11);
        arrayList3.add(12);
        arrayList3.add(200);
        arrayList3.add(13);
        arrayList3.add(11);
        arrayList3.add(12);
        arrayList3.add(13);
        arrayList3.add(14);
        arrayList3.add(15);
        System.out.println(UniqueFinder3.findUnique (arrayList3));


        //4 **
        System.out.println("4та частина **");
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("dog");
        arrayList4.add("dog");
        arrayList4.add("fox");
        OccuranceCalculator44.calcOccurance (arrayList4);

        //4 ***
        System.out.println("4та частина ***");
            ArrayList <String> arrayList5 = new ArrayList<>();
            arrayList5.add("hi");
            arrayList5.add("Kitty");
            arrayList5.add("Kitty");
            arrayList5.add("Kitty");
            arrayList5.add("hi");
            arrayList5.add("bye");
            arrayList5.add("bye");
            arrayList5.add("bye");
            arrayList5.add("bye");
            arrayList5.add("bye");
            arrayList5.add("bye");
            arrayList5.add("hi");
            arrayList5.add("hi");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("hi");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("hello");
            arrayList5.add("Kitty");
            arrayList5.add("Kitty");
            arrayList5.add("Kitty");
            arrayList5.add("Kitty");
            arrayList5.add("Kitty");

            System.out.println(OccuranceFinder444.findOccurance(arrayList5));

// 6 ****
        Phonebook phonebook = new Phonebook();
        phonebook.add("Хімчистка" , "+1098765013");
        phonebook.add("Бетмен і Робін" , "+10664213424");
        phonebook.add("Енігма" , "+1062345088");
        phonebook.add("Жінка Кішка" , "+106648234535");
        phonebook.add("Джокер" , "+10664235031");

        System.out.println(phonebook);

        System.out.println(phonebook.find("Б"));
        System.out.println(phonebook.findAll("а"));
    }
}
