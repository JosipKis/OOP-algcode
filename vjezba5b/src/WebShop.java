public class WebShop {

    private String webLocation;
    private Customer customer;
    private Package aPackage;
    private Payment payment;

    public WebShop(String webLocation, Customer customer, Package aPackage, Payment payment) {
        this.webLocation = webLocation;
        this.customer = customer;
        this.aPackage = aPackage;
        this.payment = payment;
    }

    public void orderContentFromShop() {
        if (payment.equals(customer.getCustomerPayment())) {
            System.out.println("Succefully ordered!");
            System.out.println("Package is flying from " + webLocation + " to " + customer.getLocation());
            aPackage.showContentInOrder();
        } else {
            System.out.println("Payment failed, card required is: " + payment);
        }
    }
}