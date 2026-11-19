import java.io.*;
import java.util.*;

public class Ho10Sebelum {
    public static void main(String[] args) {
        List<String> produk = new ArrayList<>();
        produk.add("Laptop, 15000000");
        produk.add("Mouse, 150000");
        produk.add("Keyboard,350000");
        try {
            FileWriter fw = new FileWriter("produk.txt");
            for (String p : produk) {
                fw.write(p + System.lineSeparator());
            }
            fw.close();
            System.out.println("Data produk berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}