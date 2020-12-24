package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromCSV {
    public static String readFromCsv(String path, int value, int line) {
        String filePath = path;
        File file = new File(filePath);
        String[] array = new String[100];
        try {
            Scanner input = new Scanner(file);
            for (int i = 0; i < 100; i++ ) {
                while (input.hasNext()) {
                    String data = input.nextLine(); // Gets the whole line
                    String[] values = data.split(",");
                    array[i] = values[value];
                }
            }
            System.out.println(array[line]);
            input.close();
            return array[line];
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
