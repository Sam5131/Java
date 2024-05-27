import java.util.ArrayList;

class Account
{
    private long accNumber;
    private double balance;
    private String name;

    public Account(long accNumber, double balance, String name)
    {
        this.accNumber=accNumber;
        this.balance=balance;
        this.name=name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setAccNumber(long accNumber)
    {
        this.accNumber=accNumber;
    }
    public long getAccNumber()
    {
        return accNumber;
    }

    public String toString()
    {
        return ("Name: "+name+"\nAccount Number: "+accNumber+"\nBalance: "+balance);
    }
}

class Bank
{
    private ArrayList<Account> accts;
    int maxActive=30;

    public boolean addAccount(Account newone)
    {
        if(accts.size()<maxActive)
        {
            accts.add(newone);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean removeAccount(long acctnum)
    {
        for(int i=0;i<accts.size();i++)
        {
            if(accts.get(i).getAccNumber()==acctnum)
            {
                accts.remove(i);
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public double deposit(long acctnum, double amount)
    {
        for(int i=0;i<accts.size();i++)
        {
            if(accts.get(i).getAccNumber()==acctnum)
            {
                accts.get(i).setBalance(accts.get(i).getBalance()+amount);
                return accts.get(i).getBalance();
            }
            else
            {
                return -1;
            }
        }
        return 0;
    }

    public double withdraw(long acctnum, double amount)
    {
        for(int i=0;i<accts.size();i++)
        {
            if(accts.get(i).getAccNumber()==acctnum)
            {
                if(accts.get(i).getBalance()>=amount)
                {
                    accts.get(i).setBalance(accts.get(i).getBalance()-amount);
                    return accts.get(i).getBalance();
                }
                else
                {
                    return -1;
                }
            }
            else
            {
                return -1;
            }
        }
        return 0;
    }

    public String toString()
    {
        String s="";
        for(int i=0;i<accts.size();i++)
        {
            s=s+accts.get(i).toString()+"\n";
        }
        return s;
    }
}

public class TestAccount
{
    public static void main(String[] args)
    {
        Account a1=new Account(123456789, 1000, "John");
        Account a2=new Account(987654321, 2000, "Mary");
        Account a3=new Account(1234567891, 3000, "Peter");
        Account a4=new Account(987654322, 4000, "Jane");
        Account a5=new Account(1234567893, 5000, "Tom");
        Account a6=new Account(98765431, 6000, "Jerry");
        Account a7=new Account(1234567829, 7000, "Alice");
        Account a8=new Account(9876541, 8000, "Bob");
        Account a9=new Account(1234561789, 9000, "David");
        Account a10=new Account(98765321, 10000, "Eve");

        Bank b=new Bank();
        b.addAccount(a1);
        b.addAccount(a2);
        b.addAccount(a3);
        b.addAccount(a4);
        b.addAccount(a5);
        b.addAccount(a6);
        b.addAccount(a7);
        b.addAccount(a8);
        b.addAccount(a9);
        b.addAccount(a10);

        System.out.println(b.toString());

        b.removeAccount(123456789);
        b.removeAccount(987654321);

        System.out.println(b.toString());

        b.deposit(1234567829, 1000);
        b.deposit(98765321, 2000);

        System.out.println(b.toString());

        b.withdraw(1234567829, 8000);
        b.withdraw(98765321, 9000);

        System.out.println(b.toString());
    }
}