/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class AirVehicle extends Vehicle {
     double wingSpan;
     String engineType;

    public AirVehicle(String madeBy, String model, int year, String fuelType,double wingSpan, String engineType) {
        super(madeBy,model, year, fuelType);
        this.wingSpan = wingSpan;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return   super.toString()+"\nwingSpan=" + wingSpan + "\nengineType=" + engineType ;
    }
     
}
