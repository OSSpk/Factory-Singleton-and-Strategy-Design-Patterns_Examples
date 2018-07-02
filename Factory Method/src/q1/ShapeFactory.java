
package q1;


public abstract class  ShapeFactory {
    
    
    public static Shape getObject(ShapeTypes s)
    {
        if (s == ShapeTypes.CIRCLE)
            return new Circle();
        else if (s == ShapeTypes.RECTANGLE)
            return new Rectangle();
        else if (s == ShapeTypes.SQUARE)
            return new Square();
        else
            return null;        
    }    
}
