/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class MyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car = new Car("Toyota", "Camry", 2022, "Petrol", 4, "Automatic", 5, 15.5);
        System.out.println(car);
         Helicopter helicopter = new Helicopter("Bell", "407", 2020, "Jet Fuel", 10.2, "Turboshaft", true);
         System.out.println(helicopter);
          Airplane airplane = new Airplane("Boeing", "747", 2019, "Jet Fuel", 68.4, "Turbofan", 35000, 4);
          System.out.println(airplane);
    }
    
}
