/**
 * Created by shuweizhao on 2/23/16.
 */
import java.util.*;
public class CTCI_3_2_MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public CTCI_3_2_MinStack() {
        // do initialize if necessary
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        stack.push(number);
        if (min.isEmpty() || number <= min.peek()) {
            min.push(number);
        }
    }

    public int pop() {
        // write your code here
        if (stack.isEmpty()) {
            return 0;
        }
        int s = stack.peek();
        int m = min.peek();
        if (s == m) {
            min.pop();
        }
        return stack.pop();
    }

    public int min() {
        // write your code here
        return min.peek();
    }
    public static void main(String[] args) {
        CTCI_3_2_MinStack minStack = new CTCI_3_2_MinStack();
        minStack.push(3);
        System.out.println(minStack.min());
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.push(2);
        System.out.println(minStack.min());
        minStack.push(1);
        System.out.println(minStack.min());
        minStack.pop();
        minStack.pop();
        minStack.push(4);
        minStack.push(5);
        System.out.println(minStack.min());


    }

}
