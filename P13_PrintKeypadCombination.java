// P : Print Keypad combinations of a number.

public class P13_PrintKeypadCombination {
    public static String[] keypad = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printCombo(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char ch = str.charAt(idx);
        String mapping = keypad[ch - '0'];
        for(int i=0; i < mapping.length(); i++){
            printCombo(str, idx + 1, combination + mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "36";
        printCombo(str, 0, "");
    }   
}

// Time Complexity : O(4^n) where n is the length of the string.