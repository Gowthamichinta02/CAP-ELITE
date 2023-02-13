SinglyLinkedListNode f=head;
        SinglyLinkedListNode s=head;
        while(f!=null ){
            f=f.next;
            if(f!=null)
              f=f.next;
              s=s.next;
            if(f==s){
                return true;
            }
        }
        return false;
