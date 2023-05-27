public abstract class Item {

    protected int quantity;
    protected float itemInitPrice;
    protected String itemDescription;
    protected int itemID;

    public Item(int quantity, float itemInitPrice, String itemDescription){
        this.quantity = quantity;
        this.itemInitPrice = itemInitPrice;
        this.itemDescription = itemDescription;
        itemID = 1000;
    }

    protected void decreaseItemQuantity(int num){
        setQuantity(getQuantity() - num);
    }

    protected void changeItemDescription(){
        setItemDescription("Item description has changed!");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getItemInitPrice() {
        return itemInitPrice;
    }

    public void setItemInitPrice(float itemInitPrice) {
        this.itemInitPrice = itemInitPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemID() {
        return itemID;
    }

}
