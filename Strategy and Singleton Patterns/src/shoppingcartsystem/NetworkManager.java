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
public class NetworkManager implements Strategy 
{
    //-----------Singleton Design--------------------//
    private static NetworkManager obj; 
    
    private NetworkManager(){}  
   
    public static NetworkManager getInstance()
    {  
        if (obj == null)
            obj = new NetworkManager();
        
        return obj;  
    }      
    //---------------------------------------------------//
    
    
    
    //Fetches Products List from Server
    @Override
    public ArrayList<Product> getProductsList()
    {
        //Making different products for each strategy, so it clarifies which strategy is called. Its 
        //just a simulation so no real data is fetched from the server.
        
        ArrayList<Product> products = new ArrayList();
        
        products.add(new Product(1,"TV",1000));
        products.add(new Product(2,"AC",20000));
        products.add(new Product(3,"Microwave",3000));
        
        return products;        
    }
    
}
