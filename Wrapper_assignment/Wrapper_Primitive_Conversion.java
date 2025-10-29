public class Wrapper_Primitive_Conersion {
    public static void main(String[] args) {
        Double obj = 45.67;

        double d = obj.doubleValue();
        int i = (int) obj.doubleValue();

        System.out.println("Wrapper object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int (after casting): " + i);
    }
}
