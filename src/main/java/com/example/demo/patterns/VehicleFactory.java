package com.example.demo.patterns;

public class VehicleFactory {

  public Vehicle getVehicle(String vehicle) {
    if (vehicle.equals(null))
      return null;
    if (vehicle.equals("car"))
      return new Car();
    else if (vehicle.equals("truck"))
      return new Truck();
    return null;
  }

  public static void main(String[] args) {
    VehicleFactory vehicleFactory = new VehicleFactory();

    Vehicle vehicle1 = vehicleFactory.getVehicle("car");
    vehicle1.drive();

    Vehicle vehicle2 = vehicleFactory.getVehicle("truck");
    vehicle2.drive();

  }

}
