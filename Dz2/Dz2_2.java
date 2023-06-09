package Dz2;
// Задание 2
public class Dz2_2 {
    // Всегда будет ошибка из за деления на ноль
    public void Dz2(double[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
