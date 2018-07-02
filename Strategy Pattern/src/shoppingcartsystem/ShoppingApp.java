/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartsystem;

import java.util.ArrayList;

/**
 *
 * @author MuhammadHarris
 */
public class ShoppingApp 
{
    Strategy strategy;

    //-----------Singleton Design--------------------//
    private static ShoppingApp obj; 
    
    private ShoppingApp(){}  
   
    public static ShoppingApp getInstance()
    {  
        if (obj == null)
            obj = new ShoppingApp();
        
        return obj;  
    }      
    //---------------------------------------------------//
       
    public ArrayList<Product> doShopping(boolean connectivity)
    {
        if (connectivity)
            strategy = NetworkManager.getInstance();
        else
            strategy = DatabaseManager.getInstance();
        
        return strategy.getProductsList();
    }
}
