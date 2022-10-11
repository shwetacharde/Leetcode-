# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        curr = head
        for i in range(n):
            curr = curr.next
        
        if curr == None:
            return head.next
            
        slow = head
        while curr and curr.next:
            curr = curr.next
            slow = slow.next
        slow.next = slow.next.next
        
        return head
