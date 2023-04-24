package pckg_uml_24_4;

import java.util.ArrayList;

public class FleetVehicles {

    private ArrayList<Vehicle> vehicles;

    public FleetVehicles(){
        vehicles = new ArrayList<>();
    }

    public void addVehicleToFleet(Vehicle vehicle){
        if (vehicles.contains(vehicle)){
            System.out.println("Vehicle with car plate: "+ vehicle.getCarPlate() + " already in fleet!");
        }else {
            vehicles.add(vehicle);
            System.out.println("Vehicle "+ vehicle.getCarPlate() +" added to fleet!");
        }
    }

    public Vehicle removeVehicleFromFleet(Vehicle vehicle){
        Vehicle veh = null;
        if (vehicles.contains(vehicle)){
            veh = vehicle;
            vehicles.remove(vehicle);
            System.out.println(veh.getCarPlate() +" removed from fleet!");
        }else {
            System.out.println("Vehicle is not in the fleet - nothing to remove!");
        }
        return veh;
    }

    public void listAllInFleet(){
        for (Vehicle veh: vehicles){
            System.out.println(veh);
        }
    }
}
