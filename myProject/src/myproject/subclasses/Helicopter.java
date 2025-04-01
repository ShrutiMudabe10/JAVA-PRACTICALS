/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class Helicopter extends AirVehicle {
      boolean verticalTakeOff;

    public Helicopter(String madeBy, String model, int year, String fuelType,double wingSpan, String engineType,boolean verticalTakeOff) {
        super( madeBy,model, year, fuelType,wingSpan, engineType);
         this.verticalTakeOff = verticalTakeOff;  
    }

    @Override
    public String toString() {
        return super.toString()+ "\nverticalTakeOff=" + verticalTakeOff ;
    }
      
}
