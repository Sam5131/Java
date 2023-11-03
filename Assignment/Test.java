class MyTime
{
    private int hours;
    private int seconds;
    private int minutes;
    private static int nTimes=0;

    //Mutator and Accessor methods for class variables.
    public void setHours(int h)
    {
        if(h>0&&h<24)
        {
            this.hours=h;
        }
    }
    public void setMinutes(int m)
    {
        if(m>0&&m<60)
        {
            this.minutes=m;
        }
    }
    public void setSeconds(int s)
    {
        if(s>0&&s<60)
        {
            this.seconds=s;
        }
    }
    public int getHours()
    {
        return this.hours;
    }
    public int getMinutes()
    {
        return this.minutes;
    }
    public int getSeconds()
    {
        return this.seconds;
    }

    public MyTime()     //Default Constructor
    {
        this.hours=0;
        this.minutes=0;
        this.seconds=0;
        MyTime.nTimes++;
    }

    public MyTime(int h)    //Parameterized Constructor with Hours as parameter
    {
        this.hours=h;
        this.minutes=0;
        this.seconds=0;
        MyTime.nTimes++;
    }

    public MyTime(int h,int m)   //Parameterized Constructor with Hours and Minutes as parameters
    {
        this.hours=h;
        this.minutes=m;
        this.seconds=0;
        MyTime.nTimes++;
    }

    public MyTime(int h,int m,int s)    //Parameterized Constructor with Hours, Minutes and Seconds as parameters
    {
        this.hours=h;
        this.minutes=m;
        this.seconds=s;
        MyTime.nTimes++;
    }

    public void displayTime()   //DisplayTime function
    {
        String AmPm=(hours<12)?"AM":"PM";
        int hour=(hours==0||hours==12)?12:hours%12;
        System.out.println("Time: "+hour+":"+minutes+":"+seconds+" "+AmPm);
    }

    public int compareTo(MyTime T2) //Object method to compare
    {
        if(this.hours>T2.hours)
        {
            return 1;
        }
        else if(this.hours<T2.hours)
        {
            return -1;
        }
        else
        {
            if(this.minutes>T2.minutes)
            {
                return 1;
            }
            else if(this.minutes<T2.minutes)
            {
                return -1;
            }
            else
            {
                if(this.seconds>T2.seconds)
                {
                    return 1;
                }
                else if(this.seconds<T2.seconds)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        }
    }

    public static int compareTo(MyTime T1, MyTime T2)   //Class Method to compare
    {
        return T1.compareTo(T2);
    }
}
public class Test
{
    public static void main(String Args[])
    {
        MyTime T1=new MyTime();
        MyTime T2=new MyTime(12);
        MyTime T3=new MyTime(12,30);
        MyTime T4=new MyTime(12,30,45);
        MyTime T5=new MyTime(12,36,50);

        System.out.println("Comparing T1 and T2: \n"+MyTime.compareTo(T1, T2));
        System.out.println("Comparing T3 and T4: \n"+T3.compareTo(T4));

        T1.displayTime();
        T2.displayTime();
        T3.displayTime();
        T4.displayTime();
        T5.displayTime();
    }
}