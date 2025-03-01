import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите 3 числа");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        in.close();
        int arr[] = {a, b, c};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                int ch = 97 + i;
                char temp = (char)ch;
                System.out.println(temp+ " = " + arr[i]);
                flag = true;
            }
        }
        if (!flag) System.out.println("нет значений, кратных 5");
        System.out.println("Результат целочисленного деления a на b: " + a / b);
        System.out.printf("Результат деления a на b: %.12f\n", (double)(a) /(double)(b));
        System.out.println("Результат деления a на b с округлением в большую сторону: " + Math.ceil((double)(a) /(double)(b)));
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + Math.floor((double)(a) /(double)(b)));
        System.out.println("Результат деления a на b с математическим округлением: " + Math.floorDiv(a, b));
        System.out.println("Остаток от деления b на c: " + b % c);
        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));
        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));
    }
}
