package java_regular.io_streams.example1;

import java.io.*;

public class IOStreamsMain {
    public static void main(String[] args) {
        String fileName = "/home/ss/HOME/EDUCATION/1_Computer_Disciplines/6_Programming/1_Languages/1_Java/2_Code/" +
                "JavaPractice/properties.txt";
        try (InputStream inputStream = new FileInputStream(fileName);
             OutputStream outputStream = new FileOutputStream(fileName + ".copy")) {

            inputStream.transferTo(outputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
