import java.io.IOException;
import java.util.*;
class Name
{
    private String firstname;
    private String lastname;
    private String middlename;
    public Name(String name)
    {
        if(name.contains(","))
        {
            StringTokenizer strz=new StringTokenizer(name,",");
            firstname=strz.nextToken();
            middlename=strz.nextToken();
            lastname=strz.nextToken();
        }
        else if(name.contains(";"))
        {
            StringTokenizer strz=new StringTokenizer(name,";");
            lastname=strz.nextToken();
            middlename=strz.nextToken();
            firstname=strz.nextToken();
        }
        else
        {}
    }
    public String getFirstName()
    {
        return firstname;
    }
    public String getMiddleName()
    {
        return middlename;
    }
    public String getLastName()
    {
        return lastname;
    }
    public String getName()
    {
        return (firstname+" "+middlename+" "+lastname);
    }
    public String toString()
    {
        return (firstname.concat(middlename).concat(lastname));
    }
}

class Student
{
    private Name name;
    private int age;
    public Student(Name name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public Name getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return (name+" "+age);
    }
}

class StudentList
{
    public static Student[] list=new Student[10];
    public static int count=0;

    public static void addStudent(Student std)
    {
        if(count>=20) return;
        list[count]=std;
        count++;
    }

    public static Student[] getStudentsWithAge(int age)
    {
        Student[] temp=new Student[10];
        int c=0;
        for(int i=0;i<list.length;i++)
        {
            if(list[i].getAge()==age)
            {
                temp[c]=list[i];
                c++;
            }
            else
            {
                return null;
            }
        }
        return temp;
    }

    public static Student[] getStudentWithLastName(String lastName)
    {
        Student[] temp=new Student[10];
        int c=0;
        for(int i=0;i<list.length;i++)
        {
            if(list[i].getName().getLastName().equals(lastName))
            {
                temp[c]=list[i];
                c++;
            }
            else
            {
                return null;
            }
        }
        return temp;
    }

    public static Student[] getStudentsInRange(int minAge, int maxAge)
    {
        Student[] temp=new Student[10];
        int c=0;
        for(int i=0;i<list.length;i++)
        {
            if(list[i].getAge()>=minAge && list[i].getAge()<=maxAge)
            {
                temp[c]=list[i];
                c++;
            }
            else
            {
                return null;
            }
        }
        return temp;
    }
}

public class Test
{
    public static Student readStudent()throws IOException
    {
        try(Scanner sc=new Scanner(System.in))
        {
        System.out.println("Enter the first name of the student");
        String fname=sc.nextLine();
        System.out.println("Enter the middle name of the student");
        String mname=sc.nextLine();
        System.out.println("Enter the last name of the student");
        String lname=sc.nextLine();
        System.out.println("Enter the age of the student");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("1.For comma(,) 2.For semicolon(;)");
        int ch=sc.nextInt();
        sc.nextLine();
        if(ch==1)
        {
            Name name=new Name(fname+","+mname+","+lname);
            Student std=new Student(name,age);
            return std;
        }
        else if(ch==2)
        {
            Name name=new Name(lname+";"+mname+";"+fname);
            Student std=new Student(name,age);
            return std;
        }
        else
        {
            return null;
        }
        }
    }

     public static void main(String[]args) throws IOException
    {
        for(int i=0;i<10;i++)
        {
            Student std=readStudent();
            StudentList.addStudent(std);
        }
        
        Student[] studentsWithAge20=StudentList.getStudentsWithAge(20);
        for(Student student:studentsWithAge20)
        {
            System.out.println(student);
        }
        Student[] studentWithLastNameSharma=StudentList.getStudentWithLastName("Sharma");
        for(Student student: studentWithLastNameSharma)
        {
            System.out.println(student);
        }
        Student[] studentinRange16to20=StudentList.getStudentsInRange(16,20);
        for(Student student: studentinRange16to20)
        {
            System.out.println(student);
        }
    }
}