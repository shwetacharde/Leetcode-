class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head.next;
        if(head==null || head.next==null) return head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=(fast.next).next;
        }
        return slow.next;
    }
}