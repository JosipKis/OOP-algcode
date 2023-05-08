package zad3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// napravi helmet i drugu klasu kuci!
public class Package {

    private int id;
    private static int cntID = 100;
    private String webShop;
    private String destination;
    private Customer customer;
    private float packagePrice;
    private int totalItems;
    private List<Item> items;
    private static final float MINI = 10f;
    private static final float MAXI = 150f;
    private static final int KOMS = 10;
    private String[] typeOfItems = {"TShirts","Sneakers"};
    private Set<Payment> payments;
    private Scanner sc;

    // constructor
    public Package(String shop, String destination, Customer customer, Payment payment){
        this.id = cntID++;
        this.items = new ArrayList<>();
        this.payments = new HashSet<>();
        this.webShop = shop;
        this.destination = destination;
        this.customer = customer;
        this.payments.add(payment);
    }

    public void setScanner(Scanner scanner){
        this.sc = scanner;
    }

    public boolean checkPaymentForPackage(){
        System.out.println("Enter payment method - ");
        boolean status = false;
        String paymentMethod = sc.nextLine();
        for (Payment payment: payments){
            if (payment.getPayment().equals(paymentMethod)){
                status = true;
                break;
            }
        }
        return status;
    }

    // Package methods
    private float randItemPrice(){
        return ThreadLocalRandom.current().nextFloat(MINI, MAXI);
    }

    private int randNumItems(){
        return ThreadLocalRandom.current().nextInt(KOMS);
    }

    public void putContent(){
        int numItems = randNumItems();
        int[] indx = new int[numItems];
        for (int k = 0; k < numItems; k++){
            indx[k] = ThreadLocalRandom.current().nextInt(typeOfItems.length);
        }
        for (int k = 0; k < numItems; k++){
            if (indx[k] == 0){
                T_Shirt tShirt = new T_Shirt(randItemPrice(), randNumItems());
                items.add(tShirt);
            }else if (indx[k] == 1){
                Sneakers sneakers = new Sneakers(randItemPrice(), randNumItems());
                items.add(sneakers);
            }
        }
        System.out.println("Finished putting contents in the package!");
        calculateTotalPackageItems();
        calculateTotalPackagePrice();
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", webShop='" + webShop + '\'' +
                ", destination='" + destination + '\'' +
                ", customer=" + customer +
                ", packagePrice=" + packagePrice +
                ", totalItems=" + totalItems +
                ", items=" + items +
                '}';
    }

    public void packageInfo(){
        System.out.println(this);
    }

    public void calculateTotalPackagePrice(){
        for (Item item: items){
            packagePrice += item.calculatePrice();
        }
        System.out.println("Price is calculated!");
    }

    public void calculateTotalPackageItems(){
        for (Item item: items){
            totalItems += item.getNumItems();
        }
        System.out.println("Finished calculating total package items!");
    }


    class T_Shirt extends Item{

        protected T_Shirt(float itemPrice, int numItems) {
            super(itemPrice, numItems);
        }
        @Override
        protected float calculatePrice() {
            return this.itemPrice * this.numItems;
        }
    }
    class Sneakers extends Item{

        protected Sneakers(float itemPrice, int numItems) {
            super(itemPrice, numItems);
        }

        @Override
        protected float calculatePrice() {
            return (float) (0.9*this.itemPrice*this.numItems);
        }
    }
}
