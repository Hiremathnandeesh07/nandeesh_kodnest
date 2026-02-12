package File_Handling;

import java.io.*;

public class DealingWithFiles {
    public static void main(String[] args) {
        try{
            BufferedReader br= new BufferedReader(new FileReader("/Users/nandeesh_b_h/Programing/KodeNest/src/File_Handling/newfile.txt"));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}