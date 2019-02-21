
public class Elephant extends Animal
{
    public Elephant(int age)
    {
        super(age);
    }
    
    public String toString()
    {
        return "Elephant is " + getAge() + " years old.";
    }
}
