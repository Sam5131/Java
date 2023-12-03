import java.util.*;

interface BinaryInterface
{
    void toBinary(int N);
}

class OneComplement implements BinaryInterface
{
    public ArrayList<Integer> Arr=new ArrayList<Integer>();

    public void toBinary(int N)
    {
        int i=0;
        while(N>0)
        {
            Arr.add(i,N%2);
            N=N/2;
            i++;
        }
        for(int j=0;j<Arr.size();j++)
        {
            if(Arr.get(j)==0)
                Arr.set(j,1);
            else
                Arr.set(j,0);
        }
    }
}

class SignedMagnitude implements BinaryInterface
{
    public ArrayList<Integer> Arr=new ArrayList<Integer>();

    public void toBinary(int N)
    {
        int i=0;
        if(N<0)
        {
            Arr.add(0,1);
            N=-N;
        }
        else
            Arr.add(0,0);
        while(N>0)
        {
            Arr.add(i+1,N%2);
            N=N/2;
            i++;
        }
    }
}

class TwoComplement implements BinaryInterface
{
    public ArrayList<Integer> Arr=new ArrayList<Integer>();

    public void toBinary(int N)
    {
        int i=0;
        if(N<0)
        {
            Arr.add(0,1);
            N=-N;
        }
        else
            Arr.add(0,0);
        while(N>0)
        {
            Arr.add(i+1,N%2);
            N=N/2;
            i++;
        }
        for(int j=0;j<Arr.size();j++)
        {
            if(Arr.get(j)==0)
                Arr.set(j,1);
            else
                Arr.set(j,0);
        }
        int carry=1;
        for(int j=1;j<Arr.size();j++)
        {
            if(Arr.get(j)==1 && carry==1)
            {
                Arr.set(j,0);
                carry=1;
            }
            else if(Arr.get(j)==0 && carry==1)
            {
                Arr.set(j,1);
                carry=0;
            }
        }
    }
}

public class BinaryTest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int N=sc.nextInt();
        System.out.println("Enter the type of binary conversion:");
        System.out.println("1. One's Complement");
        System.out.println("2. Signed Magnitude");
        System.out.println("3. Two's Complement");
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 1: OneComplement obj=new OneComplement();
                    obj.toBinary(N);
                    System.out.println("The One's Complement representation of "+N+" is:");
                    for(int i=0;i<obj.Arr.size();i++)
                    {
                        System.out.print(obj.Arr.get(i));
                    }
                    break;
            case 2: SignedMagnitude obj1=new SignedMagnitude();
                    obj1.toBinary(N);
                    System.out.println("The Signed Magnitude Representation of "+N+" is:");
                    for(int i=0;i<obj1.Arr.size();i++)
                    {
                        System.out.print(obj1.Arr.get(i));
                    }
                    break;
            case 3: TwoComplement obj2=new TwoComplement();
                    obj2.toBinary(N);
                    System.out.println("The Two's Complement representation of "+N+" is:");
                    for(int i=0;i<obj2.Arr.size();i++)
                    {
                        System.out.print(obj2.Arr.get(i));
                    }
                    break;
            default: System.out.println("Invalid choice!");
        }
        System.out.println();
    }
}