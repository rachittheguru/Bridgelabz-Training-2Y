// question no 1
import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid input! Leap year program works only for year >= 1582");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}
// Question no 2
import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}

// question no 3
import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        double percentage = (phy + chem + math) / 3.0;
        String grade, remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 75) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 40) {
            grade = "C";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Average Marks: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}

// question no 4
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is NOT Prime");
    }
}

// question no 5
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is NOT an Armstrong Number");
    }
}
// questionno 6
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        System.out.println("Number of digits in " + num + " = " + count);
    }
}
// question no 7
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal weight");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obesity");
    }
}

// questionno8
import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (num % sum == 0)
            System.out.println(num + " is a Harshad Number");
        else
            System.out.println(num + " is NOT a Harshad Number");
    }
}

// question  no 9 
import java.util.Scanner;

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        if (sum > num)
            System.out.println(num + " is an Abundant Number");
        else
            System.out.println(num + " is NOT an Abundant Number");
    }
}
// question no 10
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (first + second));
                break;
            case '-':
                System.out.println("Result = " + (first - second));
                break;
            case '*':
                System.out.println("Result = " + (first * second));
                break;
            case '/':
                if (second != 0)
                    System.out.println("Result = " + (first / second));
                else
                    System.out.println("Division by zero not allowed!");
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }
}
// question no 11
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of week: " + d0 + " (0=Sunday, 1=Monday, ... 6=Saturday)");
    }
}

