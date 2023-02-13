 SinglyLinkedListNode n = new SinglyLinkedListNode(data); 
        if (head == null) { 
            head = n;          
        } 
        else {
            SinglyLinkedListNode node = head;
            while(node.next != null) {
                node = node.next;        
            }
            node.next = n;            
        }
        return head;
