import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;

public class Ho06Latihan {

    
    static void prosesFile(String namaFile, String namaSalinan) {
        Path source = Paths.get(namaFile);
        Path target = Paths.get(namaSalinan);

        if (Files.notExists(source)) {
            System.out.println("[ERROR] File '" + namaFile + "' tidak ditemukan!");
            return;
        }

        ArrayList<String> data = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(source, StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            System.out.println("[ERROR] Gagal membaca: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = Files.newBufferedWriter(target, StandardCharsets.UTF_8)) {
            for (String baris : data) {
                bw.write(baris);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("[ERROR] Gagal menulis: " + e.getMessage());
            return;
        }

        System.out.println("Berhasil dibaca (" + data.size() + " baris) & disalin ke " + namaSalinan + ":");
        for (String baris : data) {
            System.out.println(baris);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Uji 1: file ada ===");
        prosesFile("employees.txt", "copy_employees.txt");

        System.out.println("\n=== Uji 2: file tidak ada ===");
        prosesFile("karyawan_hilang.txt", "copy_karyawan.txt");
    }
}
