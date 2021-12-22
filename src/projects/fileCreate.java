package projects;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class fileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("fileName.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("This is my file content");
            pw.println(12000);
            pw.close();
            System.out.println("done");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
