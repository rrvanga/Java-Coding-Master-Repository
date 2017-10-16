/* Given a singly-linked list, implement a method to delete the node at a given position (starting from 1 as the head
position) and return the head of the list. Do nothing if the input position is out of range. */

public ListNode deleteAtMiddle(ListNode head, int position) {
//if(head==null) return null;
int startposition = 1;
if( head == null || (position == 1 && head.next == null)){
return null;
}
else if(position == 1 && head.next!= null) {
head = head.next;
return head;
}
ListNode temp = head;
while(temp.next != null){
if(startposition +1 == position){
temp.next = temp.next.next;
break;
}
temp = temp.next;
startposition++;
}
return head;
}
