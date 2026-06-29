public class palindrome {
    public ListNode rev(ListNode head){
        ListNode curr=head;
        ListNode end=null;
        ListNode next;
        while (curr!=null){
            next=curr.next;
            curr.next=end;
            end=curr;
            curr=next;
        }
        return end;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode second = rev(slow);
        ListNode first = head;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
