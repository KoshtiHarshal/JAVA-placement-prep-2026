// P : Print all the subsequences of a string.

public class P11_Subsequences{
    public static void subsequences(String str, int idx, String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        subsequences(str, idx + 1, newstr + str.charAt(idx));

        subsequences(str, idx + 1, newstr);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str, 0, "");
    }
}

// Time Complexity : O(n²) where n is the length of the string.