package zad3;

import java.util.Scanner;

public class TestInner {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("Josip");
        System.out.println(customer);
        Payment payment1 = new Payment("Card MasterCard");
        System.out.println(payment1);
        Package package1 = new Package("Shop1", "Destination-1", customer, payment1);
        package1.putContent();
        package1.packageInfo();
    }
}
