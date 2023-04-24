package pckg_uml_24_4;

import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {

    private  String manufacturer;
    private String model;
    private int years;
    private int id;
    private static int cntID = 100;
    private String carPlate;
    private static final int MINYR = 1;
    private static final int MAXYR = 30;
    private static final String CP = "ZD - ";

    public Vehicle(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        this.years = ThreadLocalRandom.current().nextInt(MINYR, MAXYR);
        this.id = cntID++;
        this.carPlate = "[ "+ CP + id + " ]";
    }

    public void driveVehicle(){
        System.out.println("Driving vehicle with car plate: "+ carPlate);
    }

    public String getCarPlate() {
        return carPlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carPlate='" + carPlate + '\'' +
                '}';
    }
}
