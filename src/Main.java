import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное число");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("Значение функции 'сигнум' = 1");
        }
        if (n == 0) {
            System.out.println("Значение функции 'сигнум' = 0");
        }
        if (n < 0) {
            System.out.println("Значение функции 'сигнум' = -1");
        }
    }
}
