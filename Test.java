// question no 1
// ans is a(55)

//question no 2 
// ans is a(1440)

// question no 3
// ans is b(6)

// Ans 4 : A

//question no 5
// ans is C

// question no 6 
// ans is B(false0


// question no 7 
// ans is A(new)

// question no 8 
// ans is d 



// coding Questions 

import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (isPangram(s)) {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        System.out.println(result.toString()); 
    }
    public static boolean isPangram(String s) {
        s = s.toLowerCase(); 
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                return false; 
            }
        }
        return true;
    }
}

import java.util.Scanner;

public class MergeArraysSimple {
    public static int[] mergeArrays(int[] a, int[] b) {
        int n = a.length;              
        int[] c = new int[2 * n];       
        int i = 0, j = 0, k = 0;

    
        while (i < n && j < n) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        
        while (i < n) c[k++] = a[i++];
        while (j < n) c[k++] = b[j++];

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array a: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of array b: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter elements of array b:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        
        int[] result = mergeArrays(a, b);

        
        System.out.println("Merged array:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}




// question  

//apke paas do string hain:

//ek haystack (badi string)

ek needle (chhoti string)

//Ab tujhe yeh check karna hai ki needle kahaan pehaystack ke andar first time aati hai.

 //Agar needle mile, toh uska starting index return karna hai.
 //Agar needle bilkul na mile, toh -1 return karna hai.
// Aur agar needle khali string ho (""), toh answer 0 hoga.




class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()){
             return 0;
             }
        int n = haystack.length(), m = needle.length();
        if (m > n){
             return -1;
            }
        for (int i = 0; i <=n-m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) j++;
            if (j == m) return i;
        }
        return -1;
    }
}