// P : Print all the Unique subsequences of a string.

import java.util.HashSet;
public class P12_UniqueSubsequence{
    public static void subsequences(String str, int idx, String newstr,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstr)){
                return;
            }else{
                set.add(newstr);
                System.out.println(newstr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        subsequences(str, idx + 1, newstr + currChar, set);

        subsequences(str, idx + 1, newstr, set);
    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}

// Time Complexity : O(n²) where n is the length of the string.