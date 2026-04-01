import java.util.*;
public class Al_2D_Arrays {
    public static void main(String[] args) {
        //Take a matrix as input from the user. Search for an element x in the matrix and print its position. If element is not found, print "Not Found"
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: "); 
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix one by one:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == x){
                System.out.println("x found at (" + i + ", "+ j +")");
            }
        }  
    }
    
}
}
