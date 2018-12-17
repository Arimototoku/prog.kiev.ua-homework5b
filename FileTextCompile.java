package ua.i.sonne.homework5;

import java.io.*;

public class FileTextCompile {

    public static void fileTextCompile(File fileOne, File fileTwo, File result) throws IOException {
        String[] arrayOne = getStringFromFile(fileOne).split(" ");
        String[] arrayTwo = getStringFromFile(fileTwo).split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if(arrayOne[i].equals(arrayTwo[j])){
                    sb.append(arrayOne[i]).append(" ");
                    break;
                }
            }
        }
        wrightStringToFile(sb.toString(), result);
    }

    private static String getStringFromFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            throw e;
        }
        return sb.toString();
    }

    private static void wrightStringToFile(String string, File result) throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(result))){
            writer.write(string);
            writer.flush();
        }catch (IOException e){
            throw e;
        }
    }


}
