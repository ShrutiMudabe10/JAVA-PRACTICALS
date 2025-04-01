/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;


/**
 *
 * @author shruti-mudabe
 */
public class Airplane extends AirVehicle {
        int maxAltitude, numberOfEngines;

    public Airplane(String madeBy, String model, int year, String fuelType, double wingSpan, String engineType, int maxAltitude, int numberOfEngines) {
        super(madeBy, model, year, fuelType, wingSpan, engineType);
        this.maxAltitude = maxAltitude;
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nmaxAltitude=" + maxAltitude + "\nnumberOfEngines=" + numberOfEngines ;
    }
}
