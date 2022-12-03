package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile2 {

    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("/Users/nacer-zimu/IdeaProjects/qaw-fr-001-java/assignment");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        br = new BufferedReader(fr);

        String line = "";

        do{
            System.out.println(line);
            try {
                line = br.readLine();
            }catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fr.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } while (line != null);

        //garbage collection
    }
}
