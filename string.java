import java.util.Scanner;

public class SimpleStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

      
        boolean same = true;
        if (str1.length() != str2.length()) {
            same = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        
        boolean equalsResult = str1.equals(str2);

        System.out.println("charAt() comparison: " + same);
        System.out.println("equals() comparison: " + equalsResult);

        sc.close();
    }
}
