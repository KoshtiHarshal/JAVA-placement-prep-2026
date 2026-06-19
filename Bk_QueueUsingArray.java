//  Queue is a linear data structure that operates on the First In, First Out (FIFO) principle.
//  Basic operation of Queqe.
//  1. push, 2. pop, 3. front, 4. isEmpty, 5. isFull

// Implementaion of Queue using Array.

public class Bk_QueueUsingArray{
    static class Queue{
        int arr[];
        int size;
        int rear = -1;

        Queue(int n){
            arr = new int [n];
            this.size = n;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue qu = new Queue(5);
        qu.add(1);
        qu.add(2);
        qu.add(3);

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}

// Time Complexity of add operation : O(1)
// Time Complexity of all other operation : O(n)
// Space Complexity : O(1)