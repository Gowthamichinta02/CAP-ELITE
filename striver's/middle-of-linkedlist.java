 public ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        do{
            f=f.next;
            if(f!=null){
              f=f.next;
              s=s.next;
            }
        }while(f!=null);
        return s;
    }
