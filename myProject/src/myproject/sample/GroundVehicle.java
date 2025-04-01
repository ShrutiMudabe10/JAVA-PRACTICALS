/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class GroundVehicle extends Vehicle {
        int noOfWheels;
         String transmissionType;

    public GroundVehicle(String madeBy, String model, int year, String fuelType,int noOfWheels, String transmissionType) {
        super(madeBy,model, year, fuelType);
        this.noOfWheels = noOfWheels;
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return  super.toString()+"\nnoOfWheels=" + noOfWheels + "\ntransmissionType=" + transmissionType ;
    }
    
}
