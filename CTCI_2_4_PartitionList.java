/**
 * Created by shuweizhao on 2/22/16.
 */
public class CTCI_2_4_PartitionList {
    public ListNode Partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode node1 = dummy1;
        ListNode node2 = dummy2;
        while (head != null) {
            if (head.val < x) {
                node1.next = head;
                node1 = node1.next;
            }
            else {
                node2.next = head;
                node2 = node2.next;
            }
            head = head.next;
        }
        node2.next = null;
        if (node1 == dummy1) {
            return dummy2.next;
        }
        node1.next = dummy2.next;
        return dummy1.next;
    }

}
