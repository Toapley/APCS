
public class MainTest
{
    public static void main(String[] args)
    {        
        Bird bird = new Bird(10);                
        Elephant elephant = new Elephant(20);
        Plane plane = new Plane(200);
        Car car = new Car(4);
        
        System.out.println("The animals are:");
        displayAnimal(bird);
        displayAnimal(elephant);
        System.out.println();
         
        System.out.println("The vehicles are:");
        displayVehicle(plane);
        displayVehicle(car);
        System.out.println();
        
        System.out.println("The flying objects are:");
        takeFlight(bird);
        takeFlight(plane);
    }

    public static void takeFlight(FlyingObject obj)
    {
        System.out.println(obj.fly());
    }

    public static void displayAnimal(Animal animal)
    {
        System.out.println(animal);
    }
    
    public static void displayVehicle(Vehicle vehicle)
    {
        System.out.println(vehicle);
    }
}
