class MarksException extends Exception
{
    public MarksException(String s)
    {
        super(s);
    }
}

class Student 
{
    private int student_id;
    private String student_name;
    private int student_marks[]= new int[5];
    public boolean result;
    public static int no_of_passed;

    public Student(int student_id)
    {
        this.student_id = student_id;
    }

    public Student(int student_id, String student_name)
    {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    public Student(int student_id, String student_name, int student_marks[])
    {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_marks = student_marks;
    }

    public Student()
    {
        student_id = 0;
        student_name = "";
        student_marks = new int[5];
    }

    public boolean calculateResult() throws MarksException
    {
        for(int i=0;i<5;i++)
        {
            if(student_marks[i]<0 || student_marks[i]>100)
            {
                throw new MarksException("Marks should be between 0 and 100");
            }
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=student_marks[i];
        }
        if(((sum*100)/500)<=40)
        {
            this.result=false;
        }
        else
        {
            this.result=true;
            no_of_passed++;
        }
        return result;
    }
}

public class ResultTest
{
    public static void main(String[]args)
    {   try
        {
        Student s1= new Student(10);
        Student s2= new Student(20,"Rajesh",new int[]{-50,60,70,80,90});

        System.out.println(s1.calculateResult());
        System.out.println(s2.calculateResult());
        System.out.println(Student.no_of_passed);
        }
        catch(MarksException e)
        {
            System.out.println(e.getMessage());
        }
    }
}