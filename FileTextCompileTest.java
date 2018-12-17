package ua.i.sonne.homework5;

import java.io.File;
import java.io.IOException;

public class FileTextCompileTest {
    public static void main(String[] args) {
        File fileOne = new File("a.txt");
        File fileTwo = new File("b.txt");
        File resultFile = new File("c.txt");
        try {
            FileTextCompile.fileTextCompile(fileOne, fileTwo, resultFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
