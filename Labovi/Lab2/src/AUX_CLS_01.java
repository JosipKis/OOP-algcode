import java.util.ArrayList;
import java.util.Random;
public class AUX_CLS_01 {
    // Suppresing constructor - static methods only
    private AUX_CLS_01(){}

    /**
     * Generates an array of random indices bounded
     * by the number of elements in the Cars enum.
     * Use Random with seed value `12344589` to
     * generate the indices.
     * @param numIndices number of indices to generate
     * @return array of indices
     */
    public static int[] genIndices(int numIndices){
        Random generator = new Random(12344589);
        int[] indxs = new int[numIndices];
        for (int c = 0; c < numIndices; c++){
            indxs[c] = generator.nextInt(6);
        }

        return indxs;
    }

    /**
     * Updates the odometer of all cars in the arraylist by multiplying
     * the odometer value by the corresponding value in the ints array.
     * @param cars input arraylist of cars
     * @param ints input array of ints corresponding to the indices
     *             generated with genIndices()
     * @param odom input odometer value
     */
    public static void updateAll(ArrayList<Car> cars, int[] ints, long odom){
        for (int i = 0; i < ints.length; i++){
            cars.get(i).updateOdom(odom * ints[i]);
        }




    }

    /**
     * Generates an arraylist of cars based on the indices.
     * @param indxs input array of indices
     * @return arraylist of cars
     */
     public static ArrayList<Car> genSomeCars(int[] indxs){
        ArrayList<Car> carsList = new ArrayList<>();
        for (int i:indxs) {
            Car nCar = new Car(Cars.values()[i].getCarName());
            carsList.add(nCar);
        }
        return carsList;
    }

    /**
     * Prints the info of all cars in the arraylist.
     * @param cars input arraylist of cars
     */
    public static void getAllInfo(ArrayList<Car> cars){
        for (Car car : cars) {
            car.carInfo();
        }
    }
}

