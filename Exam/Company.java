class Employee
{
    private String name;
    private double salary;

    //Parameterized Constructor
    public Employee(String name, double salary)
    {
        this.name=name;
        this.salary=salary;
    }

    //Accessor and Mutator Methods
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    //toString() method
    public String toString()
    {
        return ("Name: "+name+"\nSalary: "+salary);
    }
}

class Manager extends Employee
{
    private String department;

    //Parameterized Constructor
    public Manager(String name, String department, double salary)
    {
        super(name,salary);
        this.department=department;
    }

    //Accessor and Mutator Methods
    public String getName()
    {
        return super.getName();
    }
    public double getSalary()
    {
        return super.getSalary();
    }
    public String getDepartment()
    {
        return department;
    }

    public void setName(String Name)
    {
        super.setName(Name);
    }
    public void setSalary(double salary)
    {
        super.setSalary(salary);
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }

    //toString() method
    public String toString()
    {
        return (super.toString()+"\nDepartment: "+department);
    }
}

public class Company
{
    public static void main(String[]args)
    {
        Employee e1=new Employee("John",50000);
        Manager m1=new Manager("Mary","Sales",80000);

        System.out.println(e1);
        System.out.println(m1);
    }
}