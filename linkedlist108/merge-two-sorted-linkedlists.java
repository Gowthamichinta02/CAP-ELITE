if (head1==null)
        return head2;
    if (head2==null)
        return head1;
    SinglyLinkedListNode merHead;
    if (head1.data < head2.data)
    {
        merHead = head1;
        merHead.next = mergeLists(head1.next, head2);
    }
    else{
        merHead = head2;
        merHead.next = mergeLists(head2.next, head1);
    }
    return merHead;
