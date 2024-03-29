package pl.lublin.wsei.java.cwiczenia.console;

import java.io.*;
import java.nio.charset.Charset;

public class TestReadTextEnc {

    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {

            in = new BufferedReader(new FileReader("dzieweczki.txt", Charset.forName("windows-1250")));
            out = necw BufferedWriter(new FileWriter("dziweczki_java.txt"));

            String line;

            while((line = in.readLine()) != null) {

                out.write(line);
                out.newLine();
            }
        }catch(IOException e) {

            System.out.println("IOException: " + e.getMessage());
            e.printStackTrace();

        }
        finally {

            if(in != null) {

                in.close();

            }

            if(out != null) {

                out.close();

            }
        }

    }
}
