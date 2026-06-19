// Implementaion of Circular Queue using Array.

public class Bl_CircularQueueUsingArray {
    static class Queue{
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n){
            arr = new int [n];
            this.size = n;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear + 1) % size == front;
        }
        
        public void add(int data){ 
            if(isFull()){
                System.out.println("full queue");
                return;
            }
            if (front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear){
                rear = front = -1;
            } else {
                front = (front +1) % size;
            }
            return result;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue qu = new Queue(5);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        System.out.println(qu.remove());
        qu.add(6);
        System.out.println(qu.remove());
        qu.add(7);

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}

// Time Complexity of add operation : O(1)
// Time Complexity of all other operation : O(n)
// Space Complexity : O(1)