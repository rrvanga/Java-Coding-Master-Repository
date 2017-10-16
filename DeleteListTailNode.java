//Given a singly-linked list, write a method to delete its last node and return the head.

public ListNode deleteAtTail(ListNode head) {
if(head == null || head.next == null) return null;
ListNode curr = head;
while(curr.next != null){
if(curr.next.next == null) {curr.next = null; break;}
curr = curr.next;
}
return head;
}
