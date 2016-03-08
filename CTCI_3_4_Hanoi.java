/**
 * Created by shuweizhao on 2/24/16.
 */
import java.util.*;
public class CTCI_3_4_Hanoi {
    public class Tower {
        private Stack<Integer> disks;
        private int index;
        public Tower(int index) {
            disks = new Stack<Integer>();
            this.index = index;
        }

        public void add(int d) {
            if (!disks.isEmpty() && disks.peek() < d) {
                System.out.println("Error");
                return;
            }
            disks.push(d);
        }

        public void moveTopTo(Tower t) {
            int top = disks.pop();
            t.add(top);
            System.out.println("move top disk from " + index + "to" + t);
        }

        public void moveDisks(int n, Tower t, Tower buffer) {
            if (n > 0) {
                moveDisks(n - 1, buffer, t);
                moveTopTo(t);
                buffer.moveDisks(n - 1, t, this);
            }
        }
    }


}
