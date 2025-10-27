import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("=== Static Import Demonstration ===\n");
        
        double number1 = 25.0;
        double number2 = 16.0;
        double number3 = -7.5;
        
        System.out.println("Input Numbers: " + number1 + ", " + number2 + ", " + number3);
        System.out.println();
        
        System.out.println("1. Square Root of " + number1 + " = " + sqrt(number1));
        
        System.out.println("2. " + number1 + " raised to power 2 = " + pow(number1, 2));
        
        System.out.println("3. Maximum of " + number1 + " and " + number2 + " = " + max(number1, number2));
        
        System.out.println("4. Minimum of " + number1 + " and " + number2 + " = " + min(number1, number2));
        
        System.out.println("5. Absolute value of " + number3 + " = " + abs(number3));
        
        System.out.println("\n=== Additional Math Operations ===");
        System.out.println("6. Ceiling of 4.3 = " + ceil(4.3));
        System.out.println("7. Floor of 4.7 = " + floor(4.7));
        System.out.println("8. Round of 4.6 = " + round(4.6));
        System.out.println("9. Random number = " + random());
        System.out.println("10. PI value = " + PI);
        System.out.println("11. E value = " + E);
        
        double radius = 5.0;
        double area = PI * pow(radius, 2);
        System.out.println("\n=== Practical Example ===");
        System.out.println("Area of circle with radius " + radius + " = " + area);
        
        double a = 10.5, b = 15.2, c = 8.7;
        double maximum = max(max(a, b), c);
        System.out.println("Maximum of " + a + ", " + b + ", " + c + " = " + maximum);
    }
}
