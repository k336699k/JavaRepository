package task13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Создать квадратную матрицу, заполнить ее случайными элементами, распечатать, перевернуть,
// и снова распечатать (при переворачивании нежелательно создавать еще один массив).
public class RotateMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of the square matrix = ");
        if (sc.hasNext()) {
            int matrixSize = sc.nextInt();
            sc.close();
            int[][] matriX = new int[matrixSize][matrixSize];
            Random rand = new Random();
            for (int i = 0; i < matriX.length; i++) {
                for (int j = 0; j < matriX.length; j++) {
                    matriX[i][j] = rand.nextInt(100);
                }
            }

            for (int[] ints : matriX) {
                System.out.println(Arrays.toString(ints));
            }

            for (int i = 0; i < matriX.length; i++) {
                int temp = 0;
                for (int j = i; j < matriX.length; j++) {
                    temp = matriX[i][j];
                    matriX[i][j] = matriX[j][i];
                    matriX[j][i] = temp;
                }
            }
            for (int i = 0; i < matriX.length; i++) {
                int temp = 0;
                for (int j = 0; j < matriX.length / 2; j++) {
                    temp = matriX[i][j];
                    matriX[i][j] = matriX[i][matriX.length - 1 - j];
                    matriX[i][matriX.length - 1 - j] = temp;
                }
            }

            System.out.println("Rotated :");
            for (int[] ints : matriX) {
                System.out.println(Arrays.toString(ints));
            }

        } else {
            System.out.println("incorrect number");
        }
    }
}
