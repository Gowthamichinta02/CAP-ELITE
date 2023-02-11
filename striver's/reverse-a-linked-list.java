 public ListNode reverseList(ListNode head) {
         ListNode next = null;
         ListNode current = head;
         ListNode previous = null;
        while(current!=null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head= previous;
        return head;
    }
