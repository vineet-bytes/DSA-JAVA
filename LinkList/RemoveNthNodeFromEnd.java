public class RemoveNthNodeFromEnd{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        ListNode s=dummy;
        ListNode f=dummy;
        for(int i=0;i<=n;i++){
            f=f.next;
        }
        while(f!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return dummy.next;
    }
}
