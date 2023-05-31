public class Customer {

    private Payment payment;
    private String name;
    private String location;

    public Customer(Payment Payment, String name, String location) {
        this.payment = Payment;
        this.name = name;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public Payment getCustomerPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name +
                '}';
    }
}
