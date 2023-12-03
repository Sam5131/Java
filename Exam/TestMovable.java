import java.util.*;

interface Movable   //Interface defined
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable, Comparable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y,int xSpeed, int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void moveUp()
    {
        this.y=y-ySpeed;
    }
    public void moveDown()
    {
        this.y=y+ySpeed;
    }
    public void moveLeft()
    {
        this.x=x-xSpeed;
    }
    public void moveRight()
    {
        this.x=x+xSpeed;
    }

    public String toString()
    {
        return (x+","+y);
    }

    public int compareTo(Object obj)
    {
        MovablePoint m=(MovablePoint)obj;
        if(this.x==m.x&&this.y==m.y)
        {
            return 0;
        }
        else if(this.x>m.x&&this.y>m.y)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class MovableCircle implements Movable
{
    MovablePoint center;
    int radius;

    public MovableCircle(int x,int y,int xSpeed, int ySpeed, int radius)
    {
        super();
        center=new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }

    public void moveUp()
    {
        center.y=center.y-center.ySpeed;
    }
    public void moveDown()
    {
        center.y+=center.ySpeed;
    }
    public void moveLeft()
    {
        center.x-=center.xSpeed;
    }
    public void moveRight()
    {
        center.x+=center.xSpeed;
    }

    public String toString()
    {
        return center.x+","+center.y;
    }
}

class MovableCircle_RadiusComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        MovableCircle m1=(MovableCircle)obj1;
        MovableCircle m2=(MovableCircle)obj2;
        if(m1.radius==m2.radius)
        {
            return 0;
        }
        else if(m1.radius>m2.radius)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

class MovableCircle_CenterComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        MovableCircle m1=(MovableCircle)obj1;
        MovableCircle m2=(MovableCircle)obj2;
        if(m1.center.x==m2.center.x&&m1.center.y==m2.center.y)
        {
            return 0;
        }
        else if(m1.center.x>m2.center.x&&m1.center.y>m2.center.y)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    
    }
}

class MovableCircle_RadiusCenter implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        MovableCircle m1=(MovableCircle)obj1;
        MovableCircle m2=(MovableCircle)obj2;
        if(m1.radius==m2.radius&&m1.center.x==m2.center.x&&m1.center.y==m2.center.y)
        {
            return 0;
        }
        else if(m1.radius>m2.radius&&m1.center.x>m2.center.x&&m1.center.y>m2.center.y)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}

public class TestMovable
{
    public static void main(String[] args) {
        Movable m1=new MovableCircle(5, 6,10,10,4);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

           
        Movable m2 = new MovableCircle(2, 1, 2, 20,4);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        MovableCircle_RadiusCenter compare1= new MovableCircle_RadiusCenter();
        int a=(compare1.compare(m1, m2));
        System.out.println(a);

        MovableCircle_RadiusComparator compare2= new MovableCircle_RadiusComparator();
        int b=(compare2.compare(m1, m2));
        System.out.println(b);

        MovableCircle_CenterComparator compare3= new MovableCircle_CenterComparator();
        int c=(compare3.compare(m1, m2));
        System.out.println(c);
    }
}