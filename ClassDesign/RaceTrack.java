/*Exercise 4:
A. Define a class Car which encapsulates following attributes and methods
Attributes: private scope 
•	year - The year field is an int that holds a car's year model (e.g. 2010)
•	make - The make field is a String object that holds the make of the car (e.g. "TATA")
•	speed - The speed field is an double that holds a car's current speed (e.g. 25.0)

Constructor: Default scope
 The constructor should accept the car's year, make, and beginning speed as arguments
  These values should be used to initialize the Car's year, make, and speed fields
 Methods: public scope
 •	getYear()
 •	getMake()		// These methods return the values stored in an object's fields.
 •	getSpeed()
 
 •	Accelerate()
 /* This method adds 1 to the speed attribute each time it is called. For example: if the car was going 3 mph, accelerate would set the speed to 4 mph
 •	Accelerate(int increment)*/
 /* This method adds the increment into current speed.
 •	Break(int b)
 /*  This method decrements the current speed by square root of b. For example: if the car was going 30 mph, break is called with 4 then speed would set the speed to 28 mph
 B. Define a RaceTrack class that has main method do the following activities.
 •	Create a new Car object (using the Car constructor method), passing in the year, make, and speed.
 •	Display the current status of the car object using the getter methods getYear(), getMake(), and getSpeed()
 •	Call the car's Accelerate method and then re-display the car's speed using getSpeed()
 •	Call the car's Accelerate(10) method and then re-display the car's speed using getSpeed().
 •	Call the car's break method by passing some value and then re-display the car's speed using getSpeed()
 •	Now, create a new Car object without passing arguments. Compile and observe the output.
*/

class Car
{
    private int year;
    private String make;
    private double speed;

    public Car(int year1,String make1,double speed1)
    {
        this.year=year1;
        this.make=make1;
        this.speed=speed1;
    }
    public int getYear()
    {
        return year;
    }
    public String getMake()
    {
        return make;
    }
    public double getSpeed()
    {
        return speed;
    }
    public double Accelerate()
    {
        this.speed++;
        return speed;
    }
    public double Accelerate(int increment)
    {
        this.speed+=increment;
        return speed;
    }
    public double Break(int b)
    {
        this.speed-=Math.sqrt(b);
        return speed;
    }
    public Car()
    {}    
}

public class RaceTrack
{
    public static void main(String args[])
    {
        Car c=new Car(2004,"TATA",240); 
        System.out.println("Year: "+c.getYear()+"\nMake: "+c.getMake()+"\nSpeed: "+c.getSpeed());
        c.Accelerate();
        System.out.println("Car's accelerated speed: "+c.getSpeed());
        c.Accelerate(10);
        System.out.println("Car's accelerated speed: "+c.getSpeed());
        c.Break(49);
        System.out.println("Car's speed after break: "+c.getSpeed());
        Car c1=new Car();
    }    
}
