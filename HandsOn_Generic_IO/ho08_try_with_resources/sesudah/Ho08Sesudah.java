import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Ho08Sesudah {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);
             BufferedWriter bw = Files.newBufferedWriter(Paths.get("user_input.txt"))) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            bw.write(text);
            bw.newLine();
            System.out.println("Saved!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}