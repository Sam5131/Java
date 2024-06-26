public class MergeSort {
    public static void print(int[]arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void mergesort(int[]arr){
        int n=arr.length;
        if(n==1){return;}

        int[]a=new int[n/2];
        int[]b=new int[n-n/2];

        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }

        mergesort(a);
        mergesort(b);
        Merge(a,b,arr);
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
        int[]arr={23,94,25,67,35,40};
        print(arr);
        mergesort(arr);
        print(arr);
    }

}

//Algorithm:
//1. Divide the array into two halves.
//2. Recursively sort the two halves.
//3. Merge the two halves.
//4. The base case of the recursion is when the array has less than or equal to one element.
//5. The merge step involves merging two sorted arrays into a single sorted array.
//6. The time complexity of the merge sort algorithm is O(n log n) in the average and worst case.
//7. The space complexity of the merge sort algorithm is O(n) in the worst case.
//8. The merge sort algorithm is a stable sorting algorithm.