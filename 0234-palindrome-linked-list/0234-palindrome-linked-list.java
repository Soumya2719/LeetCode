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
        ArrayList<Integer> arr=new ArrayList<>();
        if(head==null){
            return false;
        }
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        ArrayList<Integer> arr2=new ArrayList<Integer>(arr);
        Collections.reverse(arr2);
        boolean bool=arr.equals(arr2);
        return bool;
    }
}