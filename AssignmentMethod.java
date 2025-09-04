// question no 1 
import java.util.Scanner;

public class SimpleInterestCalculator {

    public static int calculateSimpleInterest(int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        int rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        int time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}
// question no 2 
import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum possible handshakes: " + handshakes);
    }
}
// question no 3 
import java.util.Scanner;

public class AthleteRun {

    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side3: ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c, 5000); // 5km = 5000m
        System.out.println("The athlete must complete " + rounds + " rounds.");
    }
}

// question no 4 
import java.util.Scanner;

public class NumberCheck {

    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkNumber(num);
        if (result == 1) System.out.println("Positive Number");
        else if (result == -1) System.out.println("Negative Number");
        else System.out.println("Zero");
    }
}

// question no 5
import java.util.Scanner;

public class SpringSeason {

    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4) || (month == 5)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        if (isSpringSeason(month, day))
            System.out.println("It’s a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}

// question no 6 
import java.util.Scanner;

public class SumNaturalNumbers {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }
}

// question no 7
import java.util.Scanner;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
}

// question no  8 
import java.util.Scanner;

public class DivisionCalculator {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();

        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Remainder: " + result[0] + ", Quotient: " + result[1]);
    }
}

// question no 9 

import java.util.Scanner;

public class ChocolateDivision {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[1] + " chocolates, Remaining = " + result[0]);
    }
}

// question no 10
import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        double windChill = calculateWindChill(temp, windSpeed);
        System.out.println("Wind Chill Temperature = " + windChill);
    }
}

// question  no 11
import java.util.Scanner;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + results[0] + ", Cosine: " + results[1] + ", Tangent: " + results[2]);
    }
}


