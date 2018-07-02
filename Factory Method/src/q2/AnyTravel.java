
package q2;


public abstract class  AnyTravel {
        
    public static Travel getObject(TravelTypes s)
    {
        if (s == TravelTypes.BUS)
            return new BusTravel();
        else if (s == TravelTypes.TRAIN)
            return new TrainTravel();
        else
            return null;        
    }    
}
