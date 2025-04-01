/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;



/**
 *
 * @author shruti-mudabe
 */
public class Bike extends GroundVehicle {
    int engineCapacity;
    String type;

    public Bike(String make, String model, int year, String fuelType, int numberOfWheels, String transmissionType, int engineCapacity, String type) {
        super(make, model, year, fuelType, numberOfWheels, transmissionType);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "engineCapacity=" + engineCapacity + "\ntype=" + type ;
    }
    
}
