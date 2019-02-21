
public class Plane extends Vehicle implements FlyingObject
{
    public Plane(int seats)
    {
        super(seats);
    }
    
    public String fly()
    {
        return "Plane flying";
    }
    
    public String toString()
    {
        return "Plane seats " + getSeats();
    }
}
