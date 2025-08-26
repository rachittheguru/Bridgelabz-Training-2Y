import java.util.Scanner;
//question no 1 
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
    }
}
//question no 2
import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("Is the first number the smallest? true");
        } else {
            System.out.println("Is the first number the smallest? false");
        }
    }
}
//question no 3
import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("Is the first number the largest? true");
        } else {
            System.out.println("Is the first number the largest? false");
        }

        if (n2 >= n1 && n2 >= n3) {
            System.out.println("Is the second number the largest? true");
        } else {
            System.out.println("Is the second number the largest? false");
        }

        if (n3 >= n1 && n3 >= n2) {
            System.out.println("Is the third number the largest? true");
        } else {
            System.out.println("Is the third number the largest? false");
        }
    }
}
//question no 4 

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}

//question no 5
import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
//question no 6
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
//question no 7
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), day = sc.nextInt();

        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
//question no 8
import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch!");
    }
}
//question no 9
import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
    }
}
//question no 10
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double val = sc.nextDouble();

        while (val != 0) {
            total += val;
            val = sc.nextDouble();
        }
        System.out.println("Total sum = " + total);
    }
}
//question no 11
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            double val = sc.nextDouble();
            if (val <= 0) {
                break;
            } else {
                total += val;
            }
        }
        System.out.println("Total sum = " + total);
    }
}
//question no 12
import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int sum = 0, i = 1;

            while (i <= n) {
                sum += i;
                i++;
            }

            if (formulaSum == sum) {
                System.out.println("Formula sum = " + formulaSum);
                System.out.println("While loop sum = " + sum);
                System.out.println("Both results match? true");
            } else {
                System.out.println("Results don’t match!");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
//question no 13
import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            if (formulaSum == sum) {
                System.out.println("Formula sum = " + formulaSum);
                System.out.println("For loop sum = " + sum);
                System.out.println("Both results match? true");
            } else {
                System.out.println("Results don’t match!");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
//question no 14
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
//question no 15
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            System.out.println("Not a natural number");
        }
    }
}

