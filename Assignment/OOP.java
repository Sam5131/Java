public class OOP 
{
    public static void main(String args[])  
    {
        if(args.length==0)
        {
            System.out.println("No Values");
            return;
        }
        String values=args[0];

        String Name=values.substring(values.indexOf("$")+1,values.lastIndexOf("$"));
        int OOP=Integer.parseInt(values.substring(values.indexOf("&")+1,values.lastIndexOf("&")));
        int DSA=Integer.parseInt(values.substring(values.indexOf("#")+1,values.lastIndexOf("#")));
        int CSA=Integer.parseInt(values.substring(values.indexOf("@")+1,values.lastIndexOf("@")));
        
        System.out.println("Name of the student: "+Name);
        System.out.println("OOP marks: "+OOP);
        System.out.println("DSA marks: "+DSA);
        System.out.println("CSA marks: "+CSA);

    }  
}
