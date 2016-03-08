/**
 * Created by shuweizhao on 2/22/16.
 */
public class CTCI_2_6_LinkedListCycle {
    //check if there is a loop exist in the a linked list
    public boolean LinkedListCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
