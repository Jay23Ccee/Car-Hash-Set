/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carhashset;

/**
 *
 * @author Jay-Cee
 */
public class Car {
    
    private String vin; // Vehicle Identification Number
    private String description; // Car description
    
    /** 
     * Constructor
     * @param v the VIN for the car.
     * @param desc The description of the car.
     * 
     */
    
    public Car(String v, String desc)
    {
        vin = v;
        description = desc;
        
    }
    
    /**
     * getVin method
     * 
     * @return the cars Vin
     */
    
    public String getVin()
    {
        return vin;
    }
    
   /**
    getDescription method
    * @return The cars description
            
            */
    
    public String getDescription()
    {
        return description;
    }
    
    /**
     * TosTRING METHOD
     * @RETURN a STRING CONTATINING THE vin AND DESCRIPTION
     * 
     */
       
    public String toString()
    {
        return "VIN:"+vin + "\t Desccrition:"+ description;
    }
    
    /**
     * HasCode method
     * 
     */
    
    
    public int hasCode()
    {
        return vin.hashCode();
    }
    
    
    /*
    Equals method
    
    @param obj Another object to compare this object to.
    @return true if the two objects are euqal, false othersie.
    
    */
    
    public boolean equals(Object obj)
    {
        // Make sure the other object is a Car.
        if(obj==null || !(obj instanceof Car))
        {
            return false;
        }
        else
        {
            //Both are cars: Get reference to other 
            // objects as a car and check if theri VIN
            // numbers are the same.
            
            Car tempCar = (Car) obj;
            return vin.equalsIgnoreCase(tempCar.vin);
        }
    }
    
}
