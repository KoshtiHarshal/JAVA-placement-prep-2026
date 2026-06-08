public class Bg_ReverseLinkedList{
    
    Node head;
    class Node{
        String data;
        Node next;

        Node(int data){
            this.data = String.valueOf(data);
            this.next = null;
        }
    }

     public void addAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){ 
            head = newNode;
        }
        else{
            Node currNode = head;
            while( currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
         }
    }

    public void printList(){
        if ( head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
            while( currNode != null){
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
            System.out.println("NULL");
    }

    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args){
        Bg_ReverseLinkedList list = new Bg_ReverseLinkedList();
        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);
        list.addAtLast(5);
        list.printList();
        list.reverseList();
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}