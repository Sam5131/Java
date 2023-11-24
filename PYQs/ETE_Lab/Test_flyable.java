interface Flyable
{
    void fly_obj();
}

class Spacecraft implements Flyable
{
    public void fly_obj()
    {
        System.out.println("Spacecraft can fly");
    }
}

class Aeroplane implements Flyable
{
    public void fly_obj()
    {
        System.out.println("Aeroplane can fly");
    }
}

class Helicopter implements Flyable
{
    public void fly_obj()
    {
        System.out.println("Helicopter can fly");
    }

}

class Test_flyable
{
    public static void main(String args[])
    {
        Spacecraft s = new Spacecraft();
        Aeroplane a = new Aeroplane();
        Helicopter h = new Helicopter();
        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
}