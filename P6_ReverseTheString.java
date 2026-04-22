// P : Print a string in reverse.

public class P6_ReverseTheString{
    public static void printRev(String str , int idx){
        if ( idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String args[]){
        String str = "ABCD";
        printRev(str, str.length()-1);        
    }
}

// Time complexity : O(n)