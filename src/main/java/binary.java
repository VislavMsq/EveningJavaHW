import java.util.Scanner;

public class binary {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls your number!");
        int q = sc.nextInt();

        // это число 396

        // перевод из 10 -> 2 (classic way)
        System.out.println(396 / 2);    // 198
        System.out.println(396 % 2);         // 0

        System.out.println(198 / 2);    // 99
        System.out.println(198 % 2);         // 0

        System.out.println(99 / 2);    // 49
        System.out.println(99 % 2);          // 1

        System.out.println(49 / 2);    // 24
        System.out.println(49 % 2);          // 1

        System.out.println(24 / 2);    // 12
        System.out.println(24 % 2);          // 0

        System.out.println(12 / 2);    // 6
        System.out.println(12 % 2);          // 0

        System.out.println(6 / 2);    // 3
        System.out.println(6 % 2);           // 0

        System.out.println(3 / 2);    // 1
        System.out.println(3 % 2);           // 1

        System.out.println(1 / 2);    // 0  <- выходим
        System.out.println(1 % 2);          // 1

        // результат - 110001100 бинарное представление числа 396

        // перевод числа из 10-й -> 2-ю (short way)
        System.out.println("short way 10 -> 2 = " + Integer.toBinaryString(q));


       sc.close();
    }
}
