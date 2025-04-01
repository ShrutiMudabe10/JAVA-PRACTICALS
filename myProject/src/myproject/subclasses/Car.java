/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class Car extends GroundVehicle {
      int  seatingCapacity;
      double trunkSpace;

     public Car(String make, String model, int year, String fuelType, int numberOfWheels, String transmissionType, int seatingCapacity, double trunkSpace) {
        super(make, model, year, fuelType, numberOfWheels, transmissionType);
        this.seatingCapacity = seatingCapacity;
        this.trunkSpace = trunkSpace;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nseatingCapacity=" + seatingCapacity + "\ntrunkSpace=" + trunkSpace;
    }
      
}
