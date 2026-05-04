// P : Remove duplicates from a string.

public class P10_RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char ch = str.charAt(idx);
        if(map[ch -'a'] == true){
            removeDuplicates(str, idx + 1, newstr);
        }else {
            newstr += ch;
            map[ch -'a'] =true;
            removeDuplicates(str, idx + 1, newstr);
        }
    }
    public static void main(String args[]){
    String str = "harshal";
    removeDuplicates(str, 0, "");
    }
}

// Time Complexity : O(n)