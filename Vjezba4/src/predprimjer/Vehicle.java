package predprimjer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

    // Attributes
    protected String brand;
    protected String model;
    protected Date dateProduction;
    private int vehicleID;
    private static int cnt = 300;
    private static final String DatePattern = "dd-MM-yyyy.";

    // Constructors
    public Vehicle(){
        System.out.println("Default constructor....");
    }
    public Vehicle(String brand){
        System.out.println("A Vehicle from the brand " + brand + " created intentionally!");
    }

    public Vehicle(String brand, String model, String datePtrn) throws ParseException {
        this.brand = brand;
        this.model = model;
        this.vehicleID = cnt;
        cnt++;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy.");
        dateProduction = sdf.parse(datePtrn);
    }

    // Methods
    public void start(){
        System.out.println("Vehicle engine has been started!");
    }

    public void stop(){
        System.out.println("Vehicle engine stopped!");
    }

    public String info(){
        String infoStr;
        infoStr = "Brand: " + brand + ", model: " + model + ", date: " + dateProduction + ", ID:" + vehicleID;

        return infoStr;
    }
}
