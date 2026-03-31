import java.util.*;
public class Ak_Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array one by one:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x)
            System.out.print("x found at index: " + i);
        }
        sc.close();
    }
} 