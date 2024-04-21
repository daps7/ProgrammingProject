/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semester2project;

import java.util.ArrayList;

/**
 *
 * @author d00267317
 */
public class Appliance implements Comparable <Appliance>
{

   //Attributes
    private String name;
    private String location;
    private boolean renewable;
    private double energy;
    private double daily_cost;
    //constructor
    public Appliance (String name, String location, boolean renewable, double energy, double daily_cost)
    {
        this.name = name;
        this.location = location;
        this.renewable = renewable;
        this.energy = energy;
        this.daily_cost = daily_cost;
    }
    public Appliance ()
    {
        this.name = "";
        this.location = "";
        this.renewable = false;
        this.energy = 0;
        this.daily_cost = 0;
    }
    //Getters
    public String getName ()
    {
        return name;
    }
    public String getlocation ()
    {
        return location;
    }
    public boolean getRenewable ()
    {
        return renewable;
    }
    public double getEnergy ()
    {
        return energy;
    }
    public double getDailycost ()
    {
        return daily_cost;
    }
    //Setters
    public void setName (String name)
    {
        this.name = name;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public void setRenewable(boolean renewable)
    {
        this.renewable = renewable;
    }
    public void setEnergy(double energy)
    {
        this.energy = energy;
    }
    public void setDailycost (double daily_cost)
    {
        this.daily_cost = daily_cost;
    }
    //toString()
    public String toString ()
    {
        return "\n"+name+"\t"+location+"\t"+renewable+"\t\t"+energy+"\t\t"+daily_cost;
        
    }

    public int compareTo(Appliance other)
    {
    return this.location.compareToIgnoreCase(other.location);
}
    
    public boolean equals(Appliance other)
    {
        if(other instanceof Appliance)
        {
            Appliance a = (Appliance) other;
            if(this.location == other.location)
            {
                return true;
            }
        }
        return false;
    }
    
}