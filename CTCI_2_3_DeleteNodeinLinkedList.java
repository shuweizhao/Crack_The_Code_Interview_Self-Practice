/**
 * Created by shuweizhao on 2/22/16.
 */
public class CTCI_2_3_DeleteNodeinLinkedList {
    public ListNode DeleteNodeinLinkedList(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null) {
            if (head.val == val) {
                prev.next = head.next;
            }
            else {
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] main) {

    }

}
