import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ho08Latihan {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Path file = Paths.get("user_input.txt");

        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = Files.newBufferedWriter(file)) {

            System.out.println("Masukkan teks (ketik 'exit' untuk selesai):");
            while (true) {
                System.out.print("> ");
                String text = sc.nextLine();
                if (text.equalsIgnoreCase("exit")) {     
                    break;
                }
     
                String baris = "[" + LocalDateTime.now().format(format) + "] " + text;
                bw.write(baris);
                bw.newLine();
                System.out.println("Tersimpan: " + baris);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Selesai menulis ke user_input.txt");
        try {
            System.out.println("\n=== Isi user_input.txt ===");
            Files.readAllLines(file).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
