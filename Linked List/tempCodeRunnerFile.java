    CopyListWithRandomPointer obj = new CopyListWithRandomPointer();

        // Creating nodes
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);

        // Connecting next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Connecting random pointers
        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        // Original List
        System.out.println("Original List:");
        Node temp = n1;

        while (temp != null) {

            int randomVal = (temp.random != null) ? temp.random.val : -1;

            System.out.println(
                "Node Value = " + temp.val +
                ", Random = " + randomVal
            );

            temp = temp.next;
        }

        // Copy List
        Node copiedHead = obj.copyRandomList(n1);

        // Copied List
        System.out.println("\nCopied List:");
        temp = copiedHead;

        while (temp != null) {

            int randomVal = (temp.random != null) ? temp.random.val : -1;

            System.out.println(
                "Node Value = " + temp.val +
                ", Random = " + randomVal
            );

            temp = temp.next;
        }
    }