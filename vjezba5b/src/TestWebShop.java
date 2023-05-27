public class TestWebShop {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Josip", "Juan Tabo 6969");
        System.out.println(customer1.toString());
        Payment payment = new Payment();
        payment.payPackage();
    }
}
