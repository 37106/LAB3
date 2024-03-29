package pl.lublin.wsei.java.cwiczenia.console;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNioCopy {

    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();
        Path oryginal = Paths.get("sample_1920x1280.tiff");
        Path kopia = Paths.get("img_copy2.tiff");
        Files.copy(oryginal, kopia, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Czas kopiowania: "
                + (float)(System.nanoTime() - startTime)/1000000+" ms");

    }
}
