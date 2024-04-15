/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Appliance;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author d00267317
 */
public class HouseTest {
    public static void main (String []args)
    {
        //Set House 1
        House h1 = new House ();
        h1.setName  ("Beginner House");
        h1.setLocation ("Suburbs");
        h1.setEnergy (25);
        h1.setRooms (4);
        
        //Setting appliances
        ArrayList <Appliance> appliances = new ArrayList<>();
        appliances.add(new Appliance("Gas Stove","Kitchen  ",false,3.5,0.90));
        appliances.add(new Appliance("Water heater","Hot Press",false,4,1.47));
        appliances.add(new Appliance("Microwave","Kitchen",true,0.5,1.47));
        
        Collections.sort(appliances);
        h1.setAppliance(appliances);
        System.out.printf ("%-10s%12s%7s%7s\n","Name","Location","Energy","Rooms");
        System.out.println (h1);
        System.out.printf ("%-10s%13s%12s%15s%14s\n","Appliance","Location in the House",
                "Renewable","Energy Usage", "Daily Cost");
        System.out.println (h1.getAppliances());
        System.out.println ("The daily cost of the household is: "+h1.totalDailyCost ());
        
    }
    
    
}
