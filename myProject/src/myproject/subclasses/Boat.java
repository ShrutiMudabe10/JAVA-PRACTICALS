/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class Boat extends WaterVehicle {
       int length;

    public Boat(String madeBy, String model, int year, String fuelType,String hullType, String propulsionType) {
        super(madeBy, model, year, fuelType,hullType, propulsionType);
    }

    @Override
    public String toString() {
        return super.toString()+ "length=" + length;
    }
    
}
