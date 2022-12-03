package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        //compiling time exception

        FileReader fr = null;
        BufferedReader br = null;

        fr = new FileReader("/Users/nacer-zimu/IdeaProjects/qaw-fr-001-java/assignment");

        br = new BufferedReader(fr);

        String line = "";

        do{
            System.out.println(line);
            line = br.readLine();
        } while (line != null);

    }
}
