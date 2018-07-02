/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

public class Client {
    
    Shape myShape;
    
    Client()
    {
        myShape = ShapeFactory.getObject(ShapeTypes.SQUARE);              
    }
    
    
    Shape getShape()
    {
        return myShape;
    }    
}
