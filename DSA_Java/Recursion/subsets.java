public class subsets {
    public static void printSubsets(int i,String s,String ans) {
        if (i==s.length()) {
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(i);
        printSubsets(i+1, s, ans+ch);   //include ch
        printSubsets(i+1, s, ans);  //doesnt include ch
    }
    public static void main(String[] args) {
        String s="abca";
        printSubsets(0,s,"");
    }
}
