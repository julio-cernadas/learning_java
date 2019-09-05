package app;

import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void list() {
        float pi = 3.14F;
        int[] numbers = {2,3,4,5,5,6,7};
        int[][] list_of_list = {{1,2,3},{4,5,6}};
        System.out.println(pi);
        System.out.println(numbers.length);
        System.out.println(Arrays.deepToString(list_of_list));
    }

    public static void mortgage_calculator() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years *MONTHS_IN_YEAR;

        double mortgage = principal * monthlyInterest * annualInterest * numberOfPayments * PERCENT * MONTHS_IN_YEAR;

        System.out.print("HAHAH You Though!");
    }

    public static void main(String[] args) {
        list();
    }
}