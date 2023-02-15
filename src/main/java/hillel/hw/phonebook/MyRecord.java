package src.main.java.hillel.hw.phonebook;

public class MyRecord {
    public String name;
    public String number;
    public MyRecord (String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Запис у книжці: " +
                "Iм'я: " + name + " Номер телефону: " + number;
    }
}

