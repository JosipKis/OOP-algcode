public class Sneakers extends Item{
    public Sneakers(int quantity, float itemInitPrice, String itemDescription) {
        super(quantity, itemInitPrice, itemDescription);
    }

    @Override
    protected void changeItemDescription() {
        System.out.println("Air-max shoe");
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
        float SneakersPrice = getItemPrice() * 1.35f;
        return SneakersPrice;
    }
}
