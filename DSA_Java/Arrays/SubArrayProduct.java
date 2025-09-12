public class SubArrayProduct {
    public static boolean checkProduct(int[] arr, int k){
        boolean flag = false;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = i; j < n; j++){
                product = arr[j] * product;
                if(product == k){
                    flag = true;
                    break;
                }
                if(product == 0 && k != 0){
                    break;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[]arr = {-2,-1,3,-4,5};
        int k = 2;
        System.out.println(checkProduct(arr,k));
    }
}
