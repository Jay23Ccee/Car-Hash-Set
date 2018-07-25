/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carhashset;

import java.util.*;

/**
 *
 * @author Jay-Cee
 */
public class CarHashSet {

       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a HashSet to store Car objects.
        Set<Car> carSet = new HashSet<>();
        
        // Add some Car objects to the HashSet .
        carSet.add(new Car("227H4", "1997 Volkswagen"));
        carSet.add(new Car("448A69", "1965 Mustang"));
        carSet.add(new Car("453B55", "2007 Porshe"));
        carSet.add(new Car("177R60", "1980 BMW"));
      
        
        // Display the elemtns in the HasSet
        
        System.out.println("Here are the cars in the set:");
        for (Car c: carSet)
        {
            System.out.println(c);
            
        }
        
        System.out.println();
        
        // Search for a specific car. This one is in the set.
        Car mustang = new Car("453B55", "2007 Porshe");
        System.out.println("Search for "+ mustang + "   "+ carSet.contains(mustang));
        
        if(carSet.contains(mustang))
        {
            System.out.println(" The Mustang is in the set.");
        }
        else 
        {
            System.out.println(" The Mustang is Not in the set.");
        }
        
        // Search for another car. This one is not in the set.
        
        Car plymouth = new Car("911C87", "200 PLYMOUTH ");
        System.out.println("Searching for"+ plymouth);
        
        if(carSet.contains(plymouth))
        {
            System.out.println("The Plymouth is in the set.");
        }
        else
        {
            System.out.println("The plymouth is NOT in the set.");
        }
        
    }
    
}
