public class SnilsValidatorImpl implements SnilsValidator {

    @Override
    public boolean validate(String snils) {
        if (snils == null || snils.length() != 11) {
            return false;
        }
        int[] digits = new int[11];
        for (int i = 0; i < 11; i++) {
            if (!Character.isDigit(snils.charAt(i))) {
                return false;
            }
            digits[i] = Character.digit(snils.charAt(i), 10);
        }
        int sum = digits[0] * 9 + digits[1] * 8 + digits[2] * 7 + digits[3] * 6 + digits[4] * 5
                + digits[5] * 4 + digits[6] * 3 + digits[7] * 2 + digits[8] * 1;
        int control = sum < 100 ? sum : (sum < 101 ? 0 : sum % 101);
        return control == digits[9] * 10 + digits[10];
    }
}