/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

public class Client {
    
    Travel myTravel;
    
    Client()
    {
       
    }
            
    public Travel getTravel()
    {
        return myTravel;
    }    
    
    public void buyTicket(TravelTypes t)
    {
        myTravel = AnyTravel.getObject(t);
    }
}
