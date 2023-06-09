package Dz2;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Dz2_1 {
    public static void main(String[] args) {
        System.out.println(new Dz2_1().exepson(skannerFloat()));
    }
    float result = 0f;
    // Ввод числа
    public static String skannerFloat() {
        System.out.println("Введите число");
        return new Scanner(System.in).nextLine();
    }
    public float exepson(String string) {
        try {
            result = Float.parseFloat(string);
        } catch (Exception e) {
            System.out.println("Вы ввели не верноые символы");
            exepson(skannerFloat());
        }
        return result;
    }
}
