public class MergeTwoSortedArrays{
    public static void print(int[]arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void Merge(int[]a,int[]b,int[]c){
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        while (i<a.length) {
            c[k++]=a[i++];
        }
    }
    public static void main(String[] args) {
        int[]a={10,30,50,70,90,100};
        int[]b={21,34,56,67,78};
        int[]c=new int[a.length+b.length];
        print(a);
        print(b);
        Merge(a,b,c);
        print(c);
    }
}