public class Jacket extends Item{

    public Jacket(int quantity, float itemInitPrice, String itemDescription) {
        super(quantity, itemInitPrice, itemDescription);
    }

    @Override
    protected void changeItemDescription() {
        System.out.println("Leather Jacket");
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

    public float getItemPrice() {
        float JacketPrice = getItemPrice() * 1.55f;
        return JacketPrice;
    }
}
