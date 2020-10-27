package tes;
import java.io.IOException;
import java.nio.file.*;

public class tes4 {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("tes4.txt");
            byte[] data = Files.readAllBytes(file);
            String isi = new String(data);
            System.out.println(isi);
        } catch (IOException e) {
            System.out.println("File Tidak Ditemukan");
        }
    }
}
