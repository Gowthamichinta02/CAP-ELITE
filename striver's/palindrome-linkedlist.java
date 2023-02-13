List<Integer> list = new ArrayList();
        list.add(head.val);
        while (head.next != null) {
            head = head.next;
            list.add(head.val);
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals( list.get( list.size() - i - 1 )))
                return false;
        }
        return true; 
