
public class Car extends Vehicle
{
    public Car(int seats)
    {
        super(seats);
    }
    
    public String toString()
    {
        return "Car seats " + getSeats();
    }
}
