// P : Remove the Nth Node from end of linked list.

public class P14_RemoveNthNodeFromLast {

    Node head;
    private int size;

    P14_RemoveNthNodeFromLast() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public Node removeNthFromEnd(int n) {
        if (head == null) {
            return null;
        }

        // Case 1: Deleting the very first node
        if (n == size) {
            head = head.next;
            return head;
        }

        // Case 2: Finding the previous node and skipping the target
        int prevPos = size - n;
        Node prev = head; // Fixed type from int to Node
        int i = 1; // Start at 1 because we are already at the head

        // Traverse to the node just BEFORE the one we want to delete
        while (i < prevPos) {
            prev = prev.next;
            i++;
        }

        // Skip the Nth node
        prev.next = prev.next.next;
        
        return head;
    }

    // A real print method to verify the list contents
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        P14_RemoveNthNodeFromLast list = new P14_RemoveNthNodeFromLast();
        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);
        list.addAtLast(5);

        System.out.println("Original List:");
        list.printList();

        int n = 5; 
        list.removeNthFromEnd(n);

        System.out.println("\nList after removing " + n + "nd node from last:");
        list.printList();
    }
}

// Time Complexity : O(N), where O(N) is the total number of nodes in the linked list.
// Space Complexity : O(1)