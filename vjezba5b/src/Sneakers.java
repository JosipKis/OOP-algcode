public class Sneakers extends Item{
    public Sneakers(int quantity, float itemInitPrice, String itemDescription) {
        super(quantity, itemInitPrice, itemDescription);
    }

    @Override
    protected void changeItemDescription() {
        System.out.println("Air-max shoe");
    }
}
