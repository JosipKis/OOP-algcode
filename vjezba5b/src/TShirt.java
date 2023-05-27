public class TShirt extends Item{

    public TShirt(int quantity, float itemInitPrice, String itemDescription) {
        super(quantity, itemInitPrice, itemDescription);
    }

    @Override
    protected void changeItemDescription() {
        System.out.println("Addidas T-Shirt");
    }
}
