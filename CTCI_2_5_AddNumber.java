/**
 * Created by shuweizhao on 2/22/16.
 */
public class CTCI_2_5_AddNumber {
    public ListNode AddNumber(ListNode num1, ListNode num2) {
        if (num1 == null) {
            return num2;
        }
        if (num2 == null) {
            return num1;
        }
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        int carry = 0, tmp  = 0;
        while (num1 != null && num2 != null) {
            tmp = num1.val + num2.val + carry;
            if (tmp >= 10) {
                tmp -= 10;
                carry = 1;
            }
            else  {
                carry = 0;
            }
            res.next = new ListNode(tmp);
            res = res.next;
            num1 = num1.next;
            num2 = num2.next;
        }

        while (num1 != null) {
            tmp = num1.val + carry;
            carry = tmp == 10 ? 1 : 0;
            tmp = tmp == 10 ? 0 : tmp;
            res.next = new ListNode(tmp);
            res = res.next;
        }


        while (num2 != null) {
            tmp = num2.val + carry;
            carry = tmp == 10 ? 1 : 0;
            tmp = tmp == 10 ? 0 : tmp;
            res.next = new ListNode(tmp);
            res = res.next;
        }

        if (carry == 1) {
            res.next = new ListNode(1);
        }
        return dummy.next;
    }

}
