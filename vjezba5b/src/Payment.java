import java.util.Scanner;

public class Payment {

    private Scanner scanner = new Scanner(System.in);

    Payment(){
    }

    private void possiblePaymentMethods(){
        System.out.println("Possible Payment options are: ");
        System.out.println("COD - Cash On Delivery");
        System.out.println("CC/DC - Credit Card / Debit Card");
        System.out.println("PP - PayPal Service");
    }

    void payPackage(){
        boolean paymentStatus = true;
        possiblePaymentMethods();
        System.out.println("Please enter your payment option: ");
        while (paymentStatus){
            String choosePayment = scanner.nextLine();
            if ("COD".equals(choosePayment)){
                System.out.println("Payment method - Cash on delivery");
                paymentStatus = false;
            } else if ("CC/DC".equals(choosePayment)) {
                System.out.println("Payment method - credit / debit card");
                paymentStatus = false;
            } else if ("PP".equals(choosePayment)) {
                System.out.println("Payment method - PayPal service");
                paymentStatus = false;
            }else {
                System.out.println("Unsupported payment option - try again...");
            }
        }
    }
}
