import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите <Enter>");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите еще одно число и нажмите <Enter>");
        int b = new Scanner(System.in).nextInt();
        double c = (double) a / (double) b;
        System.out.println("Сумма введенных чисел равна:" + (a + b));
        System.out.println("Разность введенных чисел равна:" + (a - b));
        System.out.println("Произведение введенных чисел равно:" + (a * b));
        if (c % 1 != 0) {
            System.out.println("Частное введенных чисел равно:" + c);
        } else {
            System.out.println("Частное введенных чисел равно:" + (int) c);
        }

    }
}
