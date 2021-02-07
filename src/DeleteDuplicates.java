public class DeleteDuplicates {

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur.next != null) {
            if (cur.val == prev.val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }

        }
        if (prev.val == cur.val) {
            prev.next = null;
        }
        return head;
    }
}