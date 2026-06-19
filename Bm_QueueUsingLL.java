// Implementaion of Queue using Linked List.

public class Bm_QueueUsingLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        Node head = null;
        Node tail = null;


        public boolean isEmpty(){
            return head == null & tail == null;
        }
 
        
        public void add(int data){ 
            Node newNode = new Node(data);
            if (tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail =null;
            }
            head = head.next;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Queue qu = new Queue();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}

// Time Complexity of all the operation : O(1)
// Space Complexity : O(1)