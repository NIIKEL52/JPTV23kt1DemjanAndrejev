package kontrollnaja;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число:");
        int number = scanner.nextInt();
        if (number >= 100 && number <= 999) {
            int summ1 = number / 100;
            int summ2 = (number / 10) % 10;
            int summ3 = number % 10;

            int summ4 = summ1 + summ2 + summ3;

            System.out.println("Сумма: " + summ4);
        } else {
            System.out.println("Не трехзначное");
        }

    }
}