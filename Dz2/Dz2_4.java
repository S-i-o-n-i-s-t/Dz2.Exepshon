package Dz2;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Dz2_4 {
    public static void main(String[] args) {
        new Dz2_4().result(control(trimString(skan())));
    }
    // Собираем все в один метод
    public void result(String str){
        System.out.println(str);
    }
    // Вводим сообщение
    public static String skan(){
        System.out.println("Введите текст");
        return new Scanner(System.in).nextLine();
    }
    // Обрезаем пробелы по краям строки
    public static String trimString(String str){
        str = str.trim();
        return str;
    }
    // Проверяем на соответствие требованию
    public static String control(String str){
        if (str.equals("")){
            throw new NullPointerException("Нельзя вводить пустую строку");
        }
        return str;
    }
}
