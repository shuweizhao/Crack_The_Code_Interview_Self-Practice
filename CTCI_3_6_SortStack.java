/**
 * Created by shuweizhao on 2/24/16.
 */
import java.util.*;
public class CTCI_3_6_SortStack {

    public Stack<Integer> sort(Stack<Integer> stack) {
        //calculate the total size;
        Stack<Integer> s = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            while (!s.isEmpty() && s.peek() > tmp) {
                stack.push(s.pop());
            }
            s.push(tmp);
        }
        return s;
    }

}
