package Dz2;

public class Dz2_3 {
    // Задание 3
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 }; // Не верная длинна массива
            abc[3] = 9;

            // Этот класс затеняет(затеняет) другие два

            // } catch (Throwable ex) {
            // System.out.println("Что-то пошло не так...");

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    // Не реализован FileNotFoundException. Реализуем вне класса(в отдельном классе)
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
class FileNotFoundException extends Exception {

}
