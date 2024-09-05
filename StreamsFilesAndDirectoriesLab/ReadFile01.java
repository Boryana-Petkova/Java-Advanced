package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;


public class ReadFile01 {
    public static void main(String[] args) {


        String path = "D:\\Documents\\CODENE ADVANCED\\Java Advanced-September-2023\\src\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (FileInputStream inputStream = new FileInputStream(path)) {
            int oneByte = inputStream.read();

            while (oneByte >= 0) {
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = inputStream.read();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
