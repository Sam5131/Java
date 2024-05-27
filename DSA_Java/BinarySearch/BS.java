/**
 * BS
 */
public class BS {

    public static void main(String[] args) {
        int[]arr={23,67,78,98,100,145,205};
        int target=100;
        boolean flag=false;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<target){
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}