import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static int countToBalance(String s) {
        Stack<Character> stack = new Stack<>();
        int unmatchedClosing = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    unmatchedClosing++;
                }
            }
        }

        // Remaining opening brackets in the stack are unmatched
        int unmatchedOpening = stack.size();

        return unmatchedOpening + unmatchedClosing;
    }

    public static boolean isBalanced(String s) {
        return countToBalance(s) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean balanced = isBalanced(s);
        System.out.println("Balanced: " + balanced);
        System.out.println("To make it balanced, remove: " + countToBalance(s) + " bracket(s)");
    }
}
