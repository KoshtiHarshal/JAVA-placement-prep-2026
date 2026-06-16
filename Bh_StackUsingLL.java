// Stack is a linear data structure that follows the Last-In, First-Out (LIFO) principle.
// Basic operation of Stack.
// 1. push, 2. pop, 3. top, 4. isEmpty, 5. isFull

// Stack implementation Using Linked List.


public class Bh_StackUsingLL{

    static int head;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);

        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}

// Time Complexity of all the operation : O(1)
// Space Complexity : O(1)