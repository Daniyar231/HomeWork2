public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(1, 2);
        ComplexNumber z2 = new ComplexNumber(2, 3);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        ComplexNumber z3 = z1.add(z2);
        ComplexNumber z4 = z1.subtract(z2);
        ComplexNumber z5 = z1.multiply(z2);

        System.out.println("z1 + z2 = " + z3);
        System.out.println("z1 - z2 = " + z4);
        System.out.println("z1 * z2 = " + z5);

        double magnitude = z1.getMagnitude();
        System.out.println("|z1| = " + magnitude);
    }
}