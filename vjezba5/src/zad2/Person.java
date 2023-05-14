package zad2;

import java.util.UUID;

public class Person implements CommonActions{

    // atributes
    private String name;
    private int id;
    private static int cntID = 10;
    private String doB;

    // Constructor
    public Person(String name, String doB){
        this.name = name;
        this.id = cntID++;
        this.doB = doB;
    }

    // implemented methods
    @Override
    public void walk(String direction, int distance) {
        System.out.println("I'm a human, you can't command me!");
    }

    @Override
    public String talk(String words) {
        String thts = UUID.randomUUID().toString();
        System.out.println("You want me to talk - ok: "+ thts);

        return thts;
    }

    @Override
    public void think(String thoughts) {
        System.out.println("Surely, humans are more capable of thinking then robots - aren't they?");
    }

    @Override
    public int calculate(int num) {
        System.out.println("****** Calculating ******");
        int result = num % 2;
        return result;
    }

    // methods
    public void infoPerson(){
        System.out.println("Persons name - "+ name);
        System.out.println("Persons date of birth - "+ doB);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
