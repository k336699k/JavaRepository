package laba.add1;

//Find sum the first three numerals of mantissa.
public class SumFractionNumerical {
    public static void main(String[] args) {
        double number = Math.random() + 3;
        int quantityNumber = 3;//(int) (Math.random() * 10 + 1);
        int sumNumber = 0;
        double mantissaNumber = number - (int) number;
        for (int i = 0; i < quantityNumber; i++) {
            mantissaNumber *= 10;
            sumNumber += ((int) (mantissaNumber)) % 10;
        }
        System.out.println("Введенное число = " + number +
                ". \nСумма " + quantityNumber + " чисел дробной части равна " + sumNumber);
    }
}
