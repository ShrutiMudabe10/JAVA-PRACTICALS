/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myproject;

/**
 *
 * @author shruti-mudabe
 */
public class Vehicle {
      private String madeBy;
      private String model;
      private int year;
      private String fuelType;
      Vehicle(String madeBy,String model,int year,String fuelType){
          this.madeBy = madeBy;
          this.model = model;
          this.year = year;
          this.fuelType = fuelType;
      }
      public void setFuelType(String fuelType){
          this.fuelType = fuelType;
      }
      public String getFuelType(){
          return fuelType;
      }
      public String getModel(){
          return model;
      }
      public int getyear(){
          return year;
      }
      public void openTank(){
         System.out.println("Fill the tank!");
      }
    public String toString(){
        return "Made By:"+madeBy+"\nModel:"+model+"\nyear:"+year+"\nFuel Type:"+fuelType;
    }
}
