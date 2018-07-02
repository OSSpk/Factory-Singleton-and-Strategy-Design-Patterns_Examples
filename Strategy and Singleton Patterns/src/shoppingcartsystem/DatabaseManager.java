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
public class DatabaseManager implements Strategy 
{
    //-----------Singleton Design--------------------//
    private static DatabaseManager obj; 
    
    private DatabaseManager(){}  
   
    public static DatabaseManager getInstance()
    {  
        if (obj == null)
            obj = new DatabaseManager();
        
        return obj;  
    }      
    //---------------------------------------------------//
    
    
    
    //Fetches Products List from Database
    @Override
    public ArrayList<Product> getProductsList()
    {
        //Making different products for each strategy, so it clarifies which strategy is called. Its 
        //just a simulation so no real data is fetched from the database.
        
        ArrayList<Product> products = new ArrayList();
        
        products.add(new Product(10,"Mobile",50000));
        products.add(new Product(11,"Laptop",60000));
        products.add(new Product(12,"PC",70000));
        
        return products;        
    }    
}
