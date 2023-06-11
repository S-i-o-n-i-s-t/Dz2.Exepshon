package Dz3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFailText {
    public void createFail(String[] text){
        String nameFail = text[0] + ".txt";
        try (FileWriter writer = new FileWriter(nameFail, true)) {
            writer.write("\n");
            for (String item: text) {
                writer.write(item + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка: Не удалось добавить текст в файл");
        }
    }
    public void readindFail(String firstName){
        String nameFile = firstName + ".txt";
        try (FileReader reader = new FileReader(nameFile)){
            char[] buf = new char[1];
            String str;
            while ((reader.read(buf)) > 0){
                for (int i = 0; i < buf.length; i++) {
                    System.out.print(buf[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при работе потока вывода");
        }
    }
}
