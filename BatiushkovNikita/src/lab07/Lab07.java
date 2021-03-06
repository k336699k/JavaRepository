package lab07;

// Different digits in number.

public class Lab07 {
    public static void main(String[] args) {
        int number = 123456780;
        boolean differentDigits = false;
        while (number != 0) {
            int interimNumber = (number - number % 10) / 10;
            while (interimNumber != 0) {
                if (number % 10 == interimNumber % 10) {
                    differentDigits = true;
                    break;
                }
                interimNumber /= 10;
            }
            number /= 10;
        }
        System.out.println(differentDigits ? "Number contains the same digits." : "Number is not contains the same digits.");
    }
}
