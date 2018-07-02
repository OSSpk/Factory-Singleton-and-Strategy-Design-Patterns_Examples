package shoppingcartsystem;

import java.util.ArrayList;


public class Main {

    //Mimicking connectivity checking using a random variable
    public static boolean checkAccessibility()
    {
        // Generate a random x coordinate (between 0 and 1)
        Double x = (Math.floor(Math.random() * 2));
        
        if (x.equals(1.0))
            return true;
        else
            return false;
    }
    
    //---------------------------------------------------------------------------//
    
    //No Separate Client Class is made. This Main class is mimicking client's behavior.
    public static void main(String[] args) 
    {
        ShoppingApp app = ShoppingApp.getInstance();
        
        boolean connectivity = checkAccessibility();
        
        ArrayList<Product> products = app.doShopping(connectivity);
 
        
        if (connectivity)
            System.out.println("User is connected to Internet! Products list is fetched from Server:\n");
        else
            System.out.println("User isn't connected to Internet! Products list is fetched from Database:\n");            
        
        //Printing Products
        
        for (int i = 0; i < products.size(); i++)
        {   
            System.out.println("ID : " + products.get(i).getId());
            System.out.println("Name : " + products.get(i).getName());
            System.out.println("Price : " + products.get(i).getPrice());            
            System.out.println("-------------------");            
        }       
    }
    
}
