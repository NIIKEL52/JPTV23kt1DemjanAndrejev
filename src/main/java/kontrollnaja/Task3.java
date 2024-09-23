package kontrollnaja;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваше имя: ");
        String firstName = scanner.nextLine();
        System.out.print("ваша фамилия: ");
        String lastName = scanner.nextLine();
        System.out.print("Год рождения: ");
        int yearOfBirth = scanner.nextInt();
        System.out.print("Ваш месяц рождения (1-12): ");
        int monthOfBirth = scanner.nextInt();
        System.out.print("Ваш день рождения: ");
        int dayOfBirth = scanner.nextInt();

        System.out.println("\nВаша информация:");
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Дата рождения: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);

    }
}
