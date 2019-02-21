
public class Bird extends Animal implements FlyingObject  
{
    public Bird(int age)
    {
        super(age);
    }
    
    public String fly()
    {
        return "Bird flying"; 
    }
    
    public String toString()
    {
        return "Bird is " + getAge() + " years old";
    }   
}
