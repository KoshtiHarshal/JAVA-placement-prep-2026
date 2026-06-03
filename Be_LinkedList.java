// Linked List is a linear data structure where each element is a separate object. Each element (node) of a list is comprising of two items - the data and a reference to the next node. The last node has a reference to null. The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a null reference.


public class Be_LinkedList {

    Node head; // head of the list
    private int size; // size of the list

    Be_LinkedList() {
        this.size = 0;
    }

    
    class Node{ // inner class
        String data; // data of the node
        Node next; // reference to the next node

        Node(String data){ // constructor of the node
            this.data = data; // assign data to the node
            this.next = null;
        }
    }

    public void addAtFirst(String data){ // method to add a node at the beginning of the list
        Node newNode = new Node(data); // create a new node with the given data
        if(head == null){
            head = newNode; // if the list is empty, make the new node the head of the list 
        }
        else{
            newNode.next = head; // point the new node to the current head
            head = newNode; // update the head to the new node
        }
        size++; // increment the size of the list
    }
    
    public void addAtLast(String data){ // method to add a node at the end of the list
        Node newNode = new Node(data);
        if(head == null){ 
            head = newNode;
        }
        else{
            Node currNode = head; // start from the head and traverse to the end of the list
            while( currNode.next != null){ // while the next node is not null, move to the next node
                currNode = currNode.next; // move to the next node
            }
            currNode.next = newNode; // point the last node to the new node
         }
         size ++;
    }

    public void deleteFirst(){ // method to delete the first node of the list
        if(head == null){
            System.out.println("List is Empty");            
        }
        else{
            size --; // decrement the size of the list
            head = head.next; // update the head to the next node, effectively removing the first node from the list
        }
    }
    
    public void deleteLast(){ // method to delete the last node of the list
        if(head == null){
            System.out.println("List is Empty");   
            return ;         
        }
        size --;
        if(head.next == null){
            head = null; // if there is only one node in the list, set the head to null, effectively making the list empty
        }
        else{
            Node secondLast = head; // start from the head and traverse to the second last node of the list
            Node lastNode = head.next; // start from the second node and traverse to the end of the list
            while(lastNode.next != null){
                lastNode = lastNode.next; // move to the next node
                secondLast = secondLast.next; // move to the next node, effectively keeping track of the second last node as we traverse the list
            }
            secondLast.next = null; // point the second last node to null, effectively removing the last node from the list
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

    public int getSize(){
        return size;
    }
    public static void main(String[] args){
        Be_LinkedList list = new Be_LinkedList(); // create a new linked list
        list.addAtFirst("a"); // add a node with data "a" at the beginning of the list
        list.addAtFirst("is"); // add a node with data "is" at the beginning of the list
        list.addAtLast("Linked List"); // add a node with data "Linked List" at the end of the list
        list.addAtFirst("This"); // add a node with data "This" at the beginning of the list
        list.printList(); // print the list, which should output "This->is->a->Linked List->NULL"
        list.deleteFirst(); // delete the first node of the list, which should remove "This" from the list
        list.printList(); // print the list, which should output "is->a->Linked List->NULL"
        list.deleteLast(); // delete the last node of the list, which should remove "Linked List" from the list
        list.printList(); // print the list, which should output "is->a->NULL"
        System.out.println("Size: " + list.getSize());
    }
}