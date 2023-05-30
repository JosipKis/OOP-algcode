public abstract class Item {

    protected int quantity;
    protected float itemPrice;
    protected String itemDescription;
    protected int itemID;
    protected static int cntID = 1;
    protected float totalPrice;

    public Item(int quantity, String itemDescription) {
        this.quantity = quantity;
        this.itemDescription = itemDescription;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotalPrice(){
        totalPrice = quantity*itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "quantity=" + quantity +
                ", itemPrice=" + itemPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                ", totalPrice=" + totalPrice +
                '}';
    }
}


