/**
 * Created by shuweizhao on 2/24/16.
 */
import java.util.*;
public class CTCI_3_5_MyQueueWithTwoStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public CTCI_3_5_MyQueueWithTwoStacks() {
        first = new Stack<Integer>();
        second = new Stack<Integer>();
    }

    public void push(int x) {
        if (empty()) {
            first.push(x);
            return;
        }
        //if (first empty second full)
        if (first.isEmpty()) {
            while(!second.isEmpty()) {
                first.push(second.pop());
            }
        }
        //data back into first and push data in.
        first.push(x);
    }
    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        return second.pop();
    }
    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        return second.peek();
    }
    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
    public static void main(String[] args) {
        CTCI_3_5_MyQueueWithTwoStacks myqueue = new CTCI_3_5_MyQueueWithTwoStacks();
        myqueue.push(1);
        myqueue.pop();
        System.out.println(myqueue.empty());
    }

}
