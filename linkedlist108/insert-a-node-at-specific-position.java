 SinglyLinkedListNode curr=new SinglyLinkedListNode(data);
       SinglyLinkedListNode p=llist;
       for(int i=0;i<position-1;i++){
           p=p.next;
       }
        curr.next=p.next;
        p.next=curr;
        return llist;
