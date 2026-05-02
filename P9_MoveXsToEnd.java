// P : Move all the 'x' in a string to the end of the string.

public class P9_MoveXsToEnd {
    public static void moveX(String str, int idx, int count, String newStr){
        if(idx ==  str.length()){
            for(int i=0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        if(ch == 'x'){
            count++;
            moveX(str, idx + 1, count, newStr);
        }
        else {
            newStr += ch;
            moveX(str, idx + 1, count, newStr);
        }
        }
    public static void main(String args[]) {
        String str = "axbcxxd";
        moveX(str, 0, 0, ""); 
    }
}

// Time Complexity : O(2n) => O(n)