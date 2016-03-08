/**
 * Created by shuweizhao on 2/23/16.
 */
import java.util.*;
public class CTCI_3_3_SetOfStacks {
    private List<Stack<Integer>> setStacks;
    private int capacity;
    private int cnt;
    public CTCI_3_3_SetOfStacks(int capacity) {
        this.capacity = capacity;
        setStacks.add(new Stack<Integer>());
        this.cnt = 0;
    }
    public CTCI_3_3_SetOfStacks() {
        this.capacity = 1000;
        setStacks.add(new Stack<Integer>());
        this.cnt = 0;
    }

    public void push(int x) {
        if (setStacks.size() == 0) {
            setStacks.add(new Stack<Integer>());
        }
        Stack<Integer> s = setStacks.get(setStacks.size() - 1);
        s.push(x);
        cnt++;
        if (cnt == capacity) {
            setStacks.add(new Stack<Integer>());
            cnt = 0;
        }
    }

    public int pop() {
        Stack<Integer> s = setStacks.get(setStacks.size() - 1);
        if (s.size() == 0) {
            setStacks.remove(setStacks.size() - 1);
        }
        if (setStacks.size() == 0) {
            return 0;
        }
        s = setStacks.get(setStacks.size() - 1);
        return s.pop();
    }

    public int popAtIndex(int index) {
        if (index >= setStacks.size()) {
            return 0;
        }
        return setStacks.get(index).pop();
    }




}
