
public class Employee {
    private String myName;
    private int myEmployeeNumber;
    private double mySalary;
    private double myTax;

    public Employee(String name, int num, double salary, double tax)
    {
        /* implementation not shown */
    }

    public String getName() { return myName; }
    public double getSalary() { return mySalary; }
    public int getEmployeeNumber() { return myEmployeeNumber; }
    public double getTax() { return myTax; }
    public void changeSalary(int newSalary) {
        mySalary = newSalary;
    }
    public double computePay() {
        return mySalary - myTax;    // take-home pay after taxes.
    } 

}
