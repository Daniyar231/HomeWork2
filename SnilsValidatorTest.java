public class SnilsValidatorTest {
    public static void main(String[] args) {
        SnilsValidator snilsValidator = new SnilsValidatorImpl();
        System.out.println(snilsValidator.validate("01468870570")); // false
        System.out.println(snilsValidator.validate("90114404441")); // true
    }
}
