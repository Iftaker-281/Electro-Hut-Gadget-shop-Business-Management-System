package Filehandler;

import java.io.*;

public class filehandeler {

    public static void write(String fileName, String data) {
        try {
            FileWriter fw = new FileWriter(fileName, true); 
            fw.write(data + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String read(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

          while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("File not found or empty");
        }
		return fileName;
	
    }
    public static String readAll(String file) {
        return null;
    }
}