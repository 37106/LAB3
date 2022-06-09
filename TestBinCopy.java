package pl.lublin.wsei.java.cwiczenia.console;

import java.io.*;

public class TestBinCopy {
    static void fsShowCurrentDir() {

        try {
            String currentPath = new java.io.File(".").getCanonicalPath();
            System.out.println("Current dir:" + currentPath);
        }catch(IOException e) {

                System.out.println("IOException: " + e.getMessage());
                e.printStackTrace();

            }
    }

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        BufferedInputStream inb = null;
        BufferedOutputStream outb = null;

        long startTime = System.nanoTime();

        fsShowCurrentDir();

        try {

            in = new FileInputStream("sample_1920x1280.tiff");
            out = new FileOutputStream("img_copy.tiff");

            inb = new BufferedInputStream(new FileInputStream("sample_1920x1280.tiff"));
            outb = new BufferedOutputStream(new FileOutputStream("img_copy2.tiff"));

            int c;

            /*while(( c = in.read()) != -1) {

                out.write(c);
            }*/

            while(( c = inb.read()) != -1) {

                outb.write(c);
;            }

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

        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;

        System.out.println("Czas wykonania w nanosekundach : " + timeElapsed);
        System.out.println("Czs wykonania w milisekundach  : " + timeElapsed / 1000000);
    }
}