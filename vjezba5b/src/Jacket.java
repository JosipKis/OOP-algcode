public class Jacket extends Item{

    public Jacket(int quantity, float itemInitPrice, String itemDescription) {
        super(quantity, itemInitPrice, itemDescription);
    }

    @Override
    protected void changeItemDescription() {
        System.out.println("Leather Jacket");
    }
}
