import java.util.LinkedList; // import the LinkedList class from the java.util package

public class Bf_CollectionFrameworkLL {
    public static void main(String args[]){ 
        LinkedList<String> list = new LinkedList<>(); // create a new LinkedList of type String
        
        list.addFirst("a"); // .addFirst() method is used to add an element at the beginning of the list
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);
        list.addLast("Linked"); // .addLast() method is used to add an element at the end of the list
        list.add ("List"); // .add() method is used to add an element at the end of the list
        System.out.println(list);
        
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ "->");
        }
        System.out.println("null");
        list.remove(2); // .remove() method is used to remove an element at a specific index, in this case it will remove the element at index 2 which is "a"
        list.removeFirst(); // .removeFirst() method is used to remove the first element of the list, in this case it will remove "This"
        list.removeLast(); // .removeLast() method is used to remove the last element of the list, in this case it will remove "List"
        System.out.println(list);
    }
}
