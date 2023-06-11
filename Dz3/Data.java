package Dz3;
import java.util.Scanner;
public class Data{
//    // Вводим строку
    public static String scannerText(){
        return new Scanner(System.in).nextLine();
    }
    // Сплитуем строку
    public static String[] splitString(String text){
        return text.split(" ");
    }
    // Применяем trim к элементам и делаем массив string в котором не будет пустых строк,
    // заодно проверяем на количество символов
    public static String[] trimString(String[] massivText)throws ArrayIndexOutOfBoundsException{
        String[] result = new String[4];
        int j = 0;
        for (int i = 0; i < massivText.length; i++) {
            massivText[i].trim();
            try {
                if (!massivText[i].equals("")) {
                    result[j] = (massivText[i]);
                    j++;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Вы ввели не верное количество данных");
                String[] text = {""};
                return text;
            }
        }
        if (j != 4){
            System.out.println("Вы ввели не верное количество данных");
            String[] text = {""};
            return text;
        }
        return result;
    }
    // Проверяем есть ли в строке числа
    public static boolean testParseInt(String text){
        String[] testText = text.split("");
        boolean item = true;
        for (int i = 0; i < testText.length; i++) {
            try {
                Integer.parseInt(testText[i]);
                item = false;
                }catch (NumberFormatException e){
            }
        }
        return item;
    }
    // Проверяем данные на корректность
    public static boolean dataVerifikator(String[] text){
        if (text.length == 4){
        for (int i = 0; i < text.length; i++) {
            switch (i) {
                case 0:
                    if (!testParseInt(text[0])) {
                        System.out.println("Фамилия не должна содержать чисел");
                        return false;
                    }
                case 1:
                    if (!testParseInt(text[1])) {
                        System.out.println("Имя не должно содержать чисел");
                        return false;
                    }
                case 2:
                    if (!testParseInt(text[2])) {
                        System.out.println("Отчество не должно содержать чисел");
                        return false;
                    }
                case 3:
                    if (text[3].split("").length != 9) {
                        System.out.println(text[3].split("").length);
                        System.out.println("Номер телефона должен быть из 9ти чисел");
                        return false;
                    }
                    try {
                        return true;
                    } catch (NumberFormatException E) {
                        System.out.println("Номер телефона может содержать только числа");
                        return false;
                    }
            }
        }
        }//else {return false;}
        return false;
    }
}
