/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) { // Edge case
            return head;
        }
        ListNode current = head;
        ListNode oddHead = null;
        ListNode oddTail = null;
        ListNode evenHead = null;
        ListNode evenTail = null;

        int counter = 1; // to check the current position is odd or even
        while (current != null) {
            ListNode newNode = new ListNode(current.val);
            if (counter % 2 != 0) {
                if (oddHead == null) {
                    oddHead = newNode;
                    oddTail = newNode;
                } else {
                    oddTail.next = newNode;
                    oddTail = newNode;
                }
            } else {
                if (evenHead == null) {
                    evenHead = newNode;
                    evenTail = newNode;
                } else {
                    evenTail.next = newNode;
                    evenTail = newNode;
                }
            }
            current = current.next;
            counter++;
        }
        oddTail.next = evenHead;
        return oddHead;
    }
}