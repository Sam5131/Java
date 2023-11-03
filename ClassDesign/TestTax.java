/*Exercises3: Write the java implementation for a class named ‘TaxOnSalary’ to calculate tax on salary. The class TaxOnSalary is described as follows: 			

Attributes: 
(i)	salary: double 		// salary to calculate tax
(ii)	isPANsubmitted: boolean 	// PAN submission status

Methods:
The class supplies the operation(s) as per the following specification:
(i)	A TaxOnSalary instance can be created either by supplying the value for the instance field isPANsubmitted OR without supplying value for any field. If TaxOnSalary instance is created by providing the value for isPANsubmitted then the value for salary is initialized with 1000.00 however it can be reinitialized through the method inputSalary()[which is described below] . If TaxOnSalary instance is created without supplying value for any field, then value for salary and isPANsubmitted is by default initialized to 0.0 and false respectively. 
(ii)	Accessor methods(s) are provided for every instance field. 
(iii)	A method for computing the tax based on salary [caculateTax() : double] is supplied. The tax is calculated as per the rules shown below:  
a.	if salary < 180000 and isPANsubmitted = true, then tax payable is zero
b.	if salary < 180000 and isPANsubmitted = false, then tax payable is 5% of the salary
c.	if 180000 < salary < 500000, then tax payable is 10% of the salary
d.	if 500000 < salary < 1000000, then tax payable is 20% of the salary
e.	if 1000000 < salary, then tax payable is 30% of the salary
(iv)	A method named inputSalary() is supplied to read the value for the salary as an input from the user [consider reading this value from keyboard] and to assign the value to the corresponding instance variable salary.

3.3 Write a Test class named TestTax.java which 
a)	Creates two instances of tax1 and tax2 of the class TaxOnSalary with different initializations [see point (i) in the description of Methods].
b)	Takes salary as an input from the user [using keyboard] for both the instances tax1 and tax2.
c)	Calculate and display tax for both the instance tax1 and tax2
*/
import java.util.*;
class TaxOnSalary
{
    private double salary;
    private boolean isPANsubmitted;
    public TaxOnSalary()
    {
        this.salary=0.0;
        this.isPANsubmitted=false;
    }
    public TaxOnSalary(boolean isPANsubmitted)
    {
        this.salary=1000.0;
        this.isPANsubmitted=isPANsubmitted;
    }
    public boolean getIsPANsubmitted()
    {
        return isPANsubmitted;
    }
    public double calculateTax()
    {
        if(salary<180000 && isPANsubmitted==true)
        {
            return 0.0;
        }
        else if(salary<180000 && isPANsubmitted==false)
        {
            return 0.05*salary;
        }
        else if(salary>180000 && salary<500000)
        {
            return 0.1*salary;
        }
        else if(salary>500000 && salary<1000000)
        {
            return 0.2*salary;
        }
        else
        {
            return 0.3*salary;
        }
    }
    public void inputSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        this.salary=sc.nextDouble();
    }
}
public class TestTax 
{
    public static void main(String args[])
    {
        TaxOnSalary tax1=new TaxOnSalary(true);
        TaxOnSalary tax2=new TaxOnSalary();
        tax1.inputSalary();
        tax2.inputSalary();
        System.out.println("The tax: "+tax1.calculateTax());
        System.out.println("The tax: "+tax2.calculateTax());
    }    
}
