package semester2project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class HouseTest {
    public static void main (String []args)
    {
        //Set House 1
        House h1 = new House ();
        h1.setName  ("Beginner House");
        h1.setLocation ("Suburbs");
        h1.setRooms (5);
        //Setting appliances
        ArrayList <Appliance> appliances = new ArrayList<>();
        appliances.add(new Appliance("Gas Stove","Kitchen  1",false,3.5,0.90));
        appliances.add(new Appliance("Water heater","Hot Press",false,4,1.47));
        appliances.add(new Appliance("Microwave","Kitchen  1",true,0.5,0.15));
        appliances.add(new Appliance("Television","Bedroom  1",false,2,0.74));
        appliances.add(new Appliance("Computer","Bedroom  2",true,3,0.8));
        appliances.add(new Appliance("Refrigerator","Kitchen  1",true,2,0.74));
        appliances.add(new Appliance("Coffee Maker","Kitchen  1",true,0.5,0.15));
        appliances.add(new Appliance("Microwave","Kitchen  1",true,0.5,0.15));
        appliances.add(new Appliance("Television","Bedroom  2",false,2,0.74));
        appliances.add(new Appliance("Computer","Sitting Room",true,1.5,0.4));
        h1.setAppliance(appliances);
        //Calculate Energy usage
        double this_energy = h1.totalEnergy();
        h1.setEnergy (this_energy);
        
        //menu
        Scanner keyboard = new Scanner(System.in);
        printMenu();
        System.out.println("Please input your chosen option");
        int option = keyboard.nextInt();
        while(option !=7)
        {
            if(option == 1)
            {
                option1(h1);
            }
            else if(option == 2)
            {
                option2(h1);
            }
            else if(option == 3)
            {
                option3(h1.getAppliances());
            }
            else if (option ==4)
            {
                option4(h1,appliances);
            }
            else if (option ==5)
            {
                option5(h1.getAppliances());
            }
            else if (option ==6)
            {
                option6(h1.getAppliances());
            }
            else        
            {
                System.out.println("Invalid input please try again");
            }
             printMenu();
            System.out.println("Please input your chosen option:");
            option = keyboard.nextInt();
            

    }
}
        public static void printMenu()
    {
        System.out.println("**************************************Option Menu:**************************************");
        System.out.println("1. Display House");
        System.out.println("2. Add Appliance");
        System.out.println("3. Modify an Appliance");
        System.out.println("4. View Appliances");
        System.out.println("5. Delete Appliance");
        System.out.println("6. Sort the appliances");
        System.out.println("7. Exit");
       System.out.println("*****************************************************************************************");
    }
        public static void option1(House h1)
    {
        
        printHouse(h1);
    }
    public static void option2(House h)
    {
        boolean renewable=false;
        String yesorno="";
        System.out.println("You have selected to input a new appliance");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input new appliance's name");
        String name = keyboard.nextLine();
        System.out.println("Please input new appliances's location");
        String location = keyboard.nextLine();
        System.out.println("is this appliance reneweable or not?(yes or no)");
        yesorno = keyboard.nextLine();
        if (yesorno.equalsIgnoreCase("yes"))
        {
             renewable = true;
        }
        else if (yesorno.equalsIgnoreCase("no"))
        {
            renewable = false;
        }
        else
        {
           System.out.println("invalid input please re-enter your desired option");
           yesorno=keyboard.nextLine();
        }
        System.out.println("Please input new appliances's energy usage daily, in KW");
        double energy = keyboard.nextDouble();
        System.out.println("Please input new appliances's daily cost");
        double cost_daily = keyboard.nextDouble();
        Appliance a3 = new Appliance(name,location,renewable,energy,cost_daily);
        h.addAppliance (a3);
        System.out.println(a3);
    }
     public static void option3(ArrayList<Appliance> appliances) {
    Scanner keyboard = new Scanner(System.in);
     String yesorno=""; 
    System.out.println("Please type in the appliance to modify:");
    String chosenName = keyboard.nextLine(); 
    for (int i = 0; i < appliances.size(); i++) {
        Appliance a = appliances.get(i);
        if (a.getName().equalsIgnoreCase(chosenName))
        {
              System.out.println("Would you like to change the appliance name?");
              String newName = keyboard.nextLine();
              if(newName.equalsIgnoreCase("yes"))
              {
                  System.out.println("What do you want the new name to be?");
                  newName=keyboard.nextLine();
                  a.setName(newName);
              }
              else
              {
               
              }
              System.out.println("Would you like to change the appliance location?");
              String newLocation = keyboard.nextLine();
              if(newLocation.equalsIgnoreCase("yes"))
              {
                  System.out.println("What do you want the new location to be?");
                  newLocation=keyboard.nextLine();
                  a.setLocation(newLocation);
              }
              else
              {
               
              }
              System.out.println("Is the appliance renewable? (yes or no)");
              String newRenewable = keyboard.nextLine();
              if(newRenewable.equalsIgnoreCase("yes"))
              {
                  a.setRenewable(true);
              }
              else
              {
               a.setRenewable(false);
              }
              System.out.println("Would you like to change the appliances energy amount?");
              yesorno = keyboard.nextLine();
              double newEnergy;
              if(yesorno.equalsIgnoreCase("yes"))
              {
                  System.out.println("What do you want the new energy amount to be?");
                  newEnergy=keyboard.nextDouble();
                  a.setEnergy(newEnergy);
              }
              else if (yesorno.equalsIgnoreCase("no"))
              {
                  newEnergy = a.getEnergy();
              }
              else
              {
                  
              }
              System.out.println("Would you like to change the appliances daily cost?");
              yesorno = keyboard.nextLine();
              Double newCost;
              if(yesorno.equalsIgnoreCase("yes"))
              {
                  System.out.println("What do you want the new cost to be?");
                  newCost=keyboard.nextDouble();
                  a.setDailycost(newCost);
              }
              else if(yesorno.equalsIgnoreCase("no"))
              {
               
              }
              else
              {
                  
              }
              System.out.println(a);
        }
        else
        {
        }
        
    }
    
     }
     public static void option4(House h1, ArrayList<Appliance> appliances)
     {
      System.out.printf ("%-10s%13s%12s%15s%14s\n","Appliance","Location in the House",
                "Renewable","Energy Usage", "Daily Cost");
        Collections.sort(appliances);
        System.out.println (h1.getAppliances());
        System.out.printf ("The daily cost of the household is: %.2f (in euros)\n",h1.totalDailyCost ());
        System.out.printf ("The total energy of the household is: %.2f KW/Day\n",h1.totalEnergy());
     }
     public static void option5(ArrayList<Appliance> appliances)
     {
      Scanner keyboard = new Scanner(System.in);
     String yesorno=""; 
    System.out.println("Please pick an appliance to delete:");
    String chosenName = keyboard.nextLine(); 
    boolean appliance_found= false;
        for (int i = 0; i < appliances.size(); i++) 
        {
        Appliance a = appliances.get(i);
        if (a.getName().equalsIgnoreCase(chosenName))
        {
            appliance_found=true;
           appliances.remove(i);
           System.out.println("Appliance "+ chosenName +" has been deleted.");
        }
        else if (appliance_found=false)
            {
             System.out.println("Appliance was not found");
            }

        
    }   
      }
     public static void option6 (ArrayList<Appliance> appliances)
     {
        Scanner keyboard = new Scanner(System.in);
        String sort;
        System.out.println("What would you like to sort?\n1. Name");
        sort = keyboard.nextLine();
        if(sort.equalsIgnoreCase("name"))
        {
           Collections.sort(appliances);
           System.out.println(appliances);
        }
        else
        {
            System.out.println("Sorry that can't be sorted");
        }
     }
        public static void printHouse (House h1)
{
        
        System.out.printf ("%-10s%12s%7s%7s\n","Name","Location","Energy","Rooms");
        System.out.println (h1);
        
}
}

        
 