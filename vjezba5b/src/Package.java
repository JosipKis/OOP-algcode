import java.util.ArrayList;

public class Package {

    private Customer customer1;
    private ArrayList<Integer> itemQuantities;
    private long packageID;
    private ArrayList<Item> packageItems;

    public Package(Customer customer){
        this.customer1 = customer;
    }

    public void putItem(Item item, int numItems){
        for (int c = 0; c < numItems; c++){
            packageItems.add(item);
        }
    }

    public void listItemsInPackage(){
        for (Item items: packageItems){
            System.out.println(items);
        }
    }

    @Override
    public String toString() {
        return "Package{" +
                "customer=" + customer1 +
                ", itemQuantities=" + itemQuantities +
                ", packageID=" + packageID +
                ", packageItems=" + packageItems +
                '}';
    }
}
