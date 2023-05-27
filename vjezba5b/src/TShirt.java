public class TShirt extends Item{

    public TShirt(int quantity, float itemInitPrice, String itemDescription) {
        super(quantity, itemInitPrice, itemDescription);
    }

    @Override
    protected void changeItemDescription() {
        System.out.println("Addidas T-Shirt");
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "quantity=" + quantity +
                ", itemInitPrice=" + itemInitPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemID=" + itemID +
                '}';
    }

    public float getItemPrice(){
        float TShirtPrice = getItemPrice()*1.1f;
        return TShirtPrice;
    }
}
