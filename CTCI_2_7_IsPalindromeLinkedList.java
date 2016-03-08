/**
 * Created by shuweizhao on 2/22/16.
 */
public class CTCI_2_7_IsPalindromeLinkedList {
    //check is a linked List is a palindrome linked list
    public boolean IsPalindrome (ListNode head){
        if (head == null || head.next == null) {
            return true;
        }
        ListNode newHead = clone(head);
        ListNode reverseHead = reverse(head);
        return isSame(newHead, reverseHead);
    }

    private ListNode clone(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        while (head != null) {
            res.next = new ListNode(head.val);
            head = head.next;
            res = res.next;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, tmp = null;
        while(curr != null) {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

    private boolean isSame(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null || l2 != null) {
            return false;
        }
        return true;
    }

    public static void main(String[] main) {
        CTCI_2_7_IsPalindromeLinkedList ctci27 = new CTCI_2_7_IsPalindromeLinkedList();
        ListNode head = new ListNode(0);
        head.next = new ListNode(0);
        System.out.println(ctci27.IsPalindrome(head));
    }


}
