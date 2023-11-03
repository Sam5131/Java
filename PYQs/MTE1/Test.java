import java.util.*;
class test
{
    public static void main(String[]args)
    {
        try{
            Scanner sc=new Scanner(System.in);
            String name;
            int age;
            boolean isMale,isMarried;
            System.out.println("Enter your name");
            name=sc.nextLine();
            System.out.println("Enter your age");
            age=sc.nextInt();
            System.out.println("Are you Male? (true/false)");
            isMale=sc.nextBoolean();
            System.out.println("Are you Married? (true/false)");
            isMarried=sc.nextBoolean();

            if(isMale==true)
            {
                System.out.println("Mr."+name);
            }
            else if(isMale==false&&isMarried==false)
            {
                System.out.println("Miss."+name);
            }
            else if(isMale==false&&isMarried==true)
            {
                System.out.println("Mrs."+name);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}