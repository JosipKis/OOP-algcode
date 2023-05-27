public class TestWebShop {

    public static void main(String[] args) {
        WebShop ws = new WebShop("WEB_BEST_OFF");
        ws.addItemInWebShop(new Jacket(550, 35, "JACKET-MODEL_AS"));
        ws.addItemInWebShop(new TShirt(190, 100, "TS-CCD100"));
        ws.addItemInWebShop(new Sneakers(450, 15, "SNKRS-XW"));
        Customer customer = new Customer("CITY - Street FST 44");
        ws.putItemsInPackage(customer);
        ws.finishAndPay();
    }
}
