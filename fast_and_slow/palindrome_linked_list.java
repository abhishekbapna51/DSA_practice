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
    public boolean isPalindrome(ListNode head) {
        // find middle
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half

        ListNode secondhalf = reverse(slow);
        //compare both the halves
        ListNode firsthalf = head;
        while (secondhalf != null){
            if(firsthalf.val != secondhalf.val) return false;
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}