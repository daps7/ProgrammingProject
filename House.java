
package semester2project;

import java.util.ArrayList;

public class House 
{
    //attributes
    private String name;
    private String location;
    private ArrayList <Appliance> appliances = new ArrayList<>();
    private double energy;
    private int rooms;
    
    //constructor
    public House (String name, String location,double energy, int rooms)
    {
        this.name = name;
        this.location = location;
        this.appliances = new ArrayList<>();
        this.energy = energy;
        this.rooms = rooms;
    }
    public House ()
    {
        this.name = "";
        this.location = "";
        this.appliances = new ArrayList<>();
        this.energy = 0;
        this.rooms = 0;
    }
    //getters
    public String getName ()
    {
        return this.name;
          
    }
    public String getLocation ()
    {
        return this.location;
          
    }
    public ArrayList<Appliance> getAppliances ()
    {
        return this.appliances;
          
    }
    public double getEnergy ()
    {
        return this.energy;
          
    }
    public int getRooms ()
    {
        return this.rooms;
          
    }
    //setters
    public void setName (String name)
    {
        this.name = name;
    }
    public void setLocation (String location)
    {
        this.location = location;
    }
    public void setAppliance (ArrayList <Appliance> appliances)
    {
        this.appliances = appliances;
    }
    public void setEnergy (double energy)
    {
        this.energy = energy;
    }
    public void setRooms (int rooms)
    {
        this.rooms = rooms;
    }
    public String toString()
    {
        return ""+name+"\t"+location+"\t"+energy+"\t"+rooms;
    }
    
    //addAppliance()
    public void addAppliance (Appliance a)
    {
        this.appliances.add(a);
    }
    public double totalDailyCost ()
    {
        double daily_cost = 0;
        for (int i = 0; i < this.appliances.size();i++)
        {
            daily_cost =  daily_cost + this.appliances.get(i).getDailycost ();
        }
        return daily_cost;
    }
    public double totalEnergy ()
    {
        double energy = 0;
        for (int i = 0; i < this.appliances.size();i++)
        {
            energy =  energy + this.appliances.get(i).getEnergy ();
        }
        return energy;
    }

   
}