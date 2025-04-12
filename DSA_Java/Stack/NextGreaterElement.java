import java.util.Stack;

public class NextGreaterElement {
    public static int[]nextGreaterElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[]res = new int[n];
        res[n-1]=-1;
        stack.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && arr[i]>stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,3};
        int[]result = nextGreaterElement(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : result){
            System.out.print(ele+" ");
        }
    }
}
