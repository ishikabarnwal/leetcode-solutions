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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue <ListNode> pq= new PriorityQueue<>((a,b)->a.val - b.val);

         for(ListNode list: lists){
            if(list != null){
               pq.add(list);
            }
         } 

         //Dummy Node to easily build the result list:
         ListNode dummy =new ListNode(0);
         ListNode current=dummy;

         while(!pq.isEmpty()){
            //it will get u smallest current node
            ListNode node =pq.poll();

            current.next=node;//attach it to the result
            current = current.next;

            //not to continue , put the next node from same list into heap 
            if(node.next!=null){
                pq.add(node.next);
            }
         }
         return dummy.next;     
    }
}