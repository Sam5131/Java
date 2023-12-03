abstract class Worker
{
    private String name;
    private double salary_rate;

    public Worker(String name, double salary_rate)
    {
        this.name = name;
        this.salary_rate = salary_rate;
    }

    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary_rate;
    }

    abstract public double computePay();
}

class FullTimeWorker extends Worker
{
    private int hours_Worked;

    public FullTimeWorker(String name, double Salary_rate, int hours_Worked)
    {
        super(name, Salary_rate);
        if(hours_Worked>0&&hours_Worked<=240)
        {
            this.hours_Worked = hours_Worked;
        }
        else
        {
            System.out.println("Invalid hours worked");
        }
    }

    public double computePay()
    {
        return getSalary() * hours_Worked;
    }
}

class HourlyWorker extends Worker
{
    private int hours_Worked;

    public HourlyWorker(String name,double Salary_rate,int hours_Worked)
    {
        super(name, Salary_rate);
        if(hours_Worked>0&&hours_Worked<=60)
        {
            this.hours_Worked = hours_Worked;
        }
        else
        {
            System.out.println("Invalid hours worked");
        }
    }

    public double computePay()
    {
        return getSalary() * hours_Worked;
    }
}

public class TestWorker
{
    public static void main(String[]args)
    {
        FullTimeWorker a1= new FullTimeWorker("Sam", 100, 200);
        HourlyWorker a2= new HourlyWorker("John", 50, 40);
        System.out.println("Full Time Worker: "+a1.getName()+"\nSalary: "+a1.computePay());
        System.out.println("Hourly Worker: "+a2.getName()+"\nSalary: "+a2.computePay());
    }
}