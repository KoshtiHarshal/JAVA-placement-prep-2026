// P : Linked List Cycle

public class P16_LinkedListCycle {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public boolean isCycle(Node head) {
        if (head == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Moves 2 steps
            slow = slow.next;      // Moves 1 step

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // FIXED: Instantiating the correct class
        P16_LinkedListCycle list = new P16_LinkedListCycle();
        
        int[] values = {1, 2, 3, 4, 5};
        for (int val : values) {
            list.addLast(val);
        }

        System.out.println("Cycle detected (Test 1): " + list.isCycle(list.head));

        Node tail = list.head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = list.head.next; 

        System.out.println("Cycle detected (Test 2): " + list.isCycle(list.head));
    }
}

// Time Complexity: O(N), where N is the total number of nodes in the linked list.
// Space Complexity: O(1)