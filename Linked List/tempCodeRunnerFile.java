     // Creating linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Call function
        int result = pairSum(head);

        // Output result
        System.out.println("Maximum Twin Sum: " + result);
    }