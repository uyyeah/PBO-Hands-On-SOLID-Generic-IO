import java.io.*;
import java.util.Scanner;

public class Ho08Sebelum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("user_input.txt");
            bw = new BufferedWriter(fw);
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            bw.write(text);
            bw.newLine();
            System.out.println("Data saved.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}