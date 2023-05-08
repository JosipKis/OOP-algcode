package zad3;

import java.util.SortedMap;

public class Customer {

    private String customerName;
    private int id;
    private static int cntID = 20;

    public Customer(String name){
        this.customerName = name;
        this.id = cntID++
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", id=" + id +
                '}';
    }

    public void customerInfo(){
        System.out.println(this);
    }
}
