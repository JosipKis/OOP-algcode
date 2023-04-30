public class Car {
    private String carName;
    private long odom;
    private int id;
    private static int cntID = 10;

    public Car(String carName){
        this.carName = carName;
        // odom postaviti na nulu
        this.odom = 0;
        // id se dobije iz cntID
        this.id = cntID++;
    }

    // metoda za update odometra - jednostano zbrajanje :)
    public void updateOdom(long odom){
        this.odom += odom;
    }

    public void carInfo(){
        System.out.println("Car name: " + carName + " | id: " + id +" | odometer: " + odom);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName=" + carName +
                ", id=" + id +
                '}';
    }
}

