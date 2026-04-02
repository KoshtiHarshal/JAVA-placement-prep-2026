public class An_StringBuilder {
    public static void main(String args[]){

    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("StringBuilder sb: " + sb);
    
    // Append method
    sb.append(" World");
    System.out.println("StringBuilder sb after append: " + sb);

    // charAt() method
    System.out.println("Character at index 1: " + sb.charAt(1));

    // Set char at index 0 to 'h'
    sb.setCharAt(0, 'h');
    System.out.println("StringBuilder sb after setCharAt: " + sb);

    // Insert method
    sb.insert(5, ",");
    System.out.println("StringBuilder sb after insert: " + sb);

    // Delete method
    sb.delete(5, 6); // Deletes the comma
    System.out.println("StringBuilder sb after delete: " + sb);

    // Reverse method 1
    sb.reverse();
    System.out.println("StringBuilder sb after reverse: " + sb);

    // Reverse method 2
    StringBuilder sb2 = new StringBuilder(sb);

    for(int i = 0; i < sb2.length() / 2; i++) {
        int frontIndex = i;
        int backIndex = sb2.length() - 1 - i;

        char frontChar = sb2.charAt(frontIndex);
        char backChar = sb2.charAt(backIndex);

        sb2.setCharAt(frontIndex, backChar);
        sb2.setCharAt(backIndex, frontChar); 
        }
    System.out.println("StringBuilder sb2 after manual reverse: " + sb2);

    // Convert StringBuilder to String
    String str = sb.toString();
    System.out.println("Converted String: " + str);
    }    
}

