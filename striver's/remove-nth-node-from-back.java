 public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newhead = new ListNode();
        newhead.next = head; 
        ListNode f=newhead;
        ListNode s=newhead;  
        for (int i = 1; i <= n ; i++) {
            f = f.next;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return newhead.next;
    }
