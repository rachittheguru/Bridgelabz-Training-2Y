//question no 1 
import java.util.Scanner;

public class FactorCalculator {

    public static int[] findFactors(int num) {
        // Step 1: count factors
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        // Step 2: store in array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static int sumSquareFactors(int[] factors) {
        int sumSq = 0;
        for (int f : factors) sumSq += Math.pow(f, 2);
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors = " + sumFactors(factors));
        System.out.println("Sum of squares of factors = " + sumSquareFactors(factors));
        System.out.println("Product of factors = " + productFactors(factors));
    }
}

// question no2
import java.util.Scanner;

public class SumNaturalRecursion {

    public static int sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);

        System.out.println("Recursive Sum = " + sumRec);
        System.out.println("Formula Sum   = " + sumForm);

        if (sumRec == sumForm) System.out.println("Both results match ✅");
        else System.out.println("Mismatch ❌");
    }
}

// question no 3
import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (isLeapYear(year))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");
    }
}

// question no 4
public class UnitConverter {

   
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
    public static double convertFeetToMeters(double feet) { return feet * 0.3048; }

   
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double meters) { return meters * 39.3701; }
    public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
    public static double convertInchesToCm(double inches) { return inches * 2.54; }


    public static double convertFahrenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFahrenheit(double c) { return (c * 9 / 5) + 32; }

   
    public static double convertPoundsToKg(double pounds) { return pounds * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }

   
    public static double convertGallonsToLiters(double gallons) { return gallons * 3.78541; }
    public static double convertLitersToGallons(double liters) { return liters * 0.264172; }
}

// question no 5
import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            if (canStudentVote(ages[i]))
                System.out.println("Student can vote ✅");
            else
                System.out.println("Student cannot vote ❌");
        }
    }
}

// question no 6
import java.util.Scanner;

public class FriendsCheck {

    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest: " + names[findYoungest(ages)]);
        System.out.println("Tallest: " + names[findTallest(heights)]);
    }
}

// question no 7
import java.util.Scanner;

public class NumberArrayCheck {

    public static boolean isPositive(int num) { return num >= 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (!isPositive(arr[i])) {
                System.out.println(arr[i] + " is Negative");
            } else {
                if (isEven(arr[i])) System.out.println(arr[i] + " is Positive & Even");
                else System.out.println(arr[i] + " is Positive & Odd");
            }
        }

        int cmp = compare(arr[0], arr[4]);
        if (cmp == 0) System.out.println("First and Last are Equal");
        else if (cmp > 0) System.out.println("First > Last");
        else System.out.println("First < Last");
    }
}

// question no 8
import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100;
        return weightKg / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, bmi

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Weight=" + data[i][0] +
                    "kg, Height=" + data[i][1] + "cm, BMI=" + data[i][2] +
                    ", Status=" + bmiStatus(data[i][2]));
        }
    }
}

// question no 9
import java.util.Scanner;

public class QuadraticRoots {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) return new double[]{}; // no real roots
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else {
            double sqrtDelta = Math.sqrt(delta);
            return new double[]{(-b + sqrtDelta) / (2 * a), (-b - sqrtDelta) / (2 * a)};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) System.out.println("No Real Roots");
        else if (roots.length == 1) System.out.println("One Root: " + roots[0]);
        else System.out.println("Roots: " + roots[0] + " and " + roots[1]);
    }
}

// question no 10
public class RandomNumbers {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);

        int sum = 0, min = numbers[0], max = numbers[0];
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        double avg = (double) sum / numbers.length;

        System.out.print("Random Numbers: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println("\nAverage = " + avg);
        System.out.println("Min = " + min + ", Max = " + max);
    }
}
