import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//This program counts the number of words of the given text

public class Sayac {
    public static void main(String[] args) {

        try {

            // Make sure the source code and your text file are in the same directory

            FileInputStream file = new FileInputStream("sample.txt"); // name of the text file will be put here

            int sum = 0;

            Scanner scn = new Scanner(file);

            while (scn.hasNext()) {
                sum++;
                scn.next();
            }

            scn.close();
            System.out.println("sum: " + sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
