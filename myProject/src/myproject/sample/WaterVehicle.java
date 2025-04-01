/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class WaterVehicle extends Vehicle {
       String hullType;
       String propulsionType;

    public WaterVehicle(String madeBy, String model, int year, String fuelType,String hullType, String propulsionType) {
        super(madeBy,model, year, fuelType);
        this.hullType = hullType;
        this.propulsionType = propulsionType;
    }

    @Override
    public String toString() {
        return super.toString()+"\nhullType=" + hullType + "\npropulsionType=" + propulsionType ;
    }
       
}
