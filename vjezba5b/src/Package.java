import java.util.ArrayList;

public class Package {

    private float totalOrderCost;
    private String orderInvoice;
    private int orderID = 10;
    private ArrayList<Item> packageItems = new ArrayList<>();

    public Package(String orderDescription) {
        this.orderInvoice = orderDescription;
        this.orderID += 1;
    }

    public void showContentInOrder() {
        System.out.println("\n----------------------------------------------");
        for (Item item : packageItems) {
            System.out.println(item);
            System.out.println();
        }
        System.out.printf("Ukupna cijena narudžbe je: %.1f $\n", totalOrderCost);
        System.out.println("----------------------------------------------\n");
    }

    public void addJacketsToOrder(int numOfJackets) {
        Jacket jacket = new Jacket(numOfJackets, "Biker jacket");
        packageItems.add(jacket);
        jacket.calculateTotalPrice();
        totalOrderCost += jacket.getTotalPrice();
    }

    public void addSneakersToOrder(int numOfSocks) {
        Sneakers socks = new Sneakers(numOfSocks, "Addidas");
        packageItems.add(socks);
        socks.calculateTotalPrice();
        totalOrderCost += socks.getTotalPrice();
    }

    public void addTShirtsToOrder(int numOfSP) {
        TShirt sweatPants = new TShirt(numOfSP, "Livaja Hajduk jersey");
        packageItems.add(sweatPants);
        sweatPants.calculateTotalPrice();
        totalOrderCost += sweatPants.getTotalPrice();
    }

    @Override
    public String toString() {
        System.out.println("Order desc: " + orderInvoice);
        showContentInOrder();
        return null;
    }

}
