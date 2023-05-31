public class TestWebShop {

    public static void main(String[] args) {
        Package package1 = new Package("Paket");
        package1.addTShirtsToOrder(2);
        package1.addJacketsToOrder(1);
        package1.addSneakersToOrder(3);
        Payment payment = new Payment();
        Customer customer = new Customer(payment, "Josip", "Sikovo, Darth Vader street");
        WebShop jeftinijeHr = new WebShop("Zagreb?", customer, package1, payment);
        jeftinijeHr.orderContentFromShop();

    }
}
