/**
 * Created by shuweizhao on 2/21/16.
 */
public class CTCI_2_2_KthToLastElement {
    public ListNode KthToLastElement(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(1);
        dummy.next = head;
        ListNode preDelete = dummy;
        for (int i = 0; i < k; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            preDelete = preDelete.next;
        }

        preDelete.next = preDelete.next.next;
        return dummy.next;
    }

}
