public boolean hasCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next;
            if(f!=null)
              f=f.next;
              s=s.next;
            if(f==s){
                return true;
            }
        }
        return false;
    }
