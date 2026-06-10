// P : Palindrome Linked List.

public class P15_PalindromeLinkedList {

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

    // Main logic
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle of the list
        Node middle = findMiddle(head);

        // 2. Reverse the second half of the list
        Node secondHalfStart = reverse(middle.next);
        Node firstHalfStart = head;

        // 3. Compare the first half and the reversed second half
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }

    // Finds the middle using the slow/fast pointer (Tortoise and Hare) approach
    private Node findMiddle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next; // Moves 2 steps
            slow = slow.next;  // Moves 1 step
        }
        return slow;
    }

    // Reverses a linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String args[]) {
        P15_PalindromeLinkedList list = new P15_PalindromeLinkedList();
        
        // Correct way to build the list in Java
        int[] values = {1, 2, 3, 4, 3, 2, 1};
        for (int val : values) {
            list.addLast(val);
        }

        System.out.println("Is Palindrome? " + list.checkPalindrome());
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)