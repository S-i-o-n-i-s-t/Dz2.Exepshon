package Dz3;

import java.util.Arrays;

public class Value extends Data{
    private static String[] mainData = new String[4];
    public static String[] getMainData() {
        return mainData;
    }
    public static boolean nevData() {
        String[] temp = trimString(splitString(scannerText()));
        if (dataVerifikator(temp) == true) {
            mainData = temp;
            return true;
        }
        return false;
    }
    public static void addTextFile(){
        if (nevData() == true) {
            new CreateFailText().createFail(mainData);
        }
    }
}
