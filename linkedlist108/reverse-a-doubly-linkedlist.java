DoublyLinkedListNode curr=llist;
       DoublyLinkedListNode prev=null;
       DoublyLinkedListNode temp=null;
       if(llist==null || llist.next==null){
           return llist;
       }
       while(curr!=null){
           temp=curr.prev;
           curr.prev=curr.next;
           curr.next=temp;
           curr=curr.prev;
       }
        llist=temp.prev;
        return llist;
