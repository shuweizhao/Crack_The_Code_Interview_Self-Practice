/**
 * Created by shuweizhao on 2/20/16.
 */
import java.util.*;
public class CTCI_2_1_RemoveDupsFromLinkedList {
    //input : head node; output : new head node
    public ListNode RemoveDupsFromLinkedList(ListNode head) {
        //invalid input
        if (head == null || head.next == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        ListNode prev = head;
        ListNode curr = head.next;
        set.add(head.val);
        while (curr != null) {
            if (set.contains(curr.val)) {
                curr = curr.next;
            }
            else {
                set.add(curr.val);
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        prev.next = curr;
        return head;
    }
    //if an extra buffer is not allowed
    public ListNode RemoveDupsFromLinkedList2(ListNode head) {
        //invalid input
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        ListNode prev = null;
        while(node != null) {
            int tmp = node.val;
            prev = node;
            ListNode next = node.next;
            while (next != null) {
                if (next.val == tmp) {
                    prev.next = next.next;
                }
                else{
                    prev = prev.next;
                }
                next = next.next;
            }
            node = node.next;
        }
        return head;
    }

    public String printOut(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head.next != null) {
            sb.append(head.val).append("->");
            head = head.next;
        }
        sb.append(head.val);
        return sb.toString();
    }

    public static void main(String[] args) {
        CTCI_2_1_RemoveDupsFromLinkedList ctci21 = new CTCI_2_1_RemoveDupsFromLinkedList();
        ListNode head = new ListNode(1);
        ListNode node = head;
        node.next = new ListNode(1);
        node = node.next;
        node.next = new ListNode(1);
        node = node.next;
        node.next = new ListNode(1);
        node = node.next;
        node.next = null;

        System.out.println(ctci21.printOut(ctci21.RemoveDupsFromLinkedList(head)));
    }

}
