import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class ProdukSesudah<T, U> {
    private T nama;
    private U harga;

    public ProdukSesudah(T nama, U harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return nama + "," + harga;
    }
}

public class Ho10Sesudah {
    public static void main(String[] args) {
        List<ProdukSesudah<String, Double>> produkList = new ArrayList<>();
        produkList.add(new ProdukSesudah<>("Laptop", 15000000.0));
        produkList.add(new ProdukSesudah<>("Mouse", 150000.0));
        produkList.add(new ProdukSesudah<>("Keyboard", 350000.0));

        Path filePath = Paths.get("produk_output.txt");
        try {
            List<String> lines = new ArrayList<>();
            for (ProdukSesudah<String, Double> p : produkList) {
                lines.add(p.toString());
            }
            Files.write(filePath, lines);
            System.out.println("Data produk berhasil disimpan menggunakan NIO.2");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }
    }
}