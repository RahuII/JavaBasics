package projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("F:\\Rahul's Resume.pdf"));
            String line;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
