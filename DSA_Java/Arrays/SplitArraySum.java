public class SplitArraySum {
    //Brute Force
    // public static boolean canSplit(int[]arr){
    //     boolean flag = false;
    //     int n = arr.length;
    //     int leftSum = 0;
    //     for(int i = 0; i < n; i++){
    //         leftSum = leftSum + arr[i];
    //         int rightSum = 0;
    //         for(int j = i + 1; j < n; j++){
    //             rightSum = rightSum + arr[j];
    //         }
    //         if(leftSum == rightSum){
    //             flag = true;
    //         }
    //     }
    //     return flag;
    // }

    //Optimal
    public static boolean canSplit(int[]arr){
        boolean flag = false;
        int leftSum = 0;
        for(int ele : arr){
            leftSum = leftSum + ele;
        }

        int rightSum = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            rightSum = rightSum + arr[i];
            leftSum = leftSum - arr[i];
            if(rightSum == leftSum){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,5};
        System.out.println(canSplit(arr));
    }
}
