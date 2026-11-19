import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class Produk<T, U> {
    private T nama;
    private U harga;
    private Integer stok;

    public Produk(T nama, U harga, Integer stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama + "," + Rupiah.format(harga) + "," + stok;
    }
}

class Pelanggan {
    private String id, nama;

    public Pelanggan(String id, String nama) { this.id = id; this.nama = nama; }

    @Override
    public String toString() { return id + "," + nama; }
}

class Transaksi {
    private String kode;
    private Double total;

    public Transaksi(String kode, Double total) { this.kode = kode; this.total = total; }

    @Override
    public String toString() { return kode + "," + Rupiah.format(total); }
}

class Rupiah {
    static String format(Object angka) {
        if (angka instanceof Number) {
            return String.format("%.0f", ((Number) angka).doubleValue());
        }
        return String.valueOf(angka);
    }
}

class DataFile<T> {
    private final Path path;

    public DataFile(String namaFile) { this.path = Paths.get(namaFile); }

    public void simpan(List<T> data) throws IOException {
        List<String> lines = new ArrayList<>();
        for (T item : data) {
            lines.add(item.toString());
        }
        Files.write(path, lines);
    }


    public void tampilkan() throws IOException {
        System.out.println("=== Isi " + path + " ===");
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
    }
}

public class Ho10Latihan {
    public static void main(String[] args) {
        try {
            DataFile<Produk<String, Double>> produkFile = new DataFile<>("produk_output.txt");
            produkFile.simpan(List.of(
                    new Produk<>("Laptop", 15000000.0, 10),
                    new Produk<>("Mouse", 150000.0, 25),
                    new Produk<>("Keyboard", 350000.0, 15)));

            DataFile<Pelanggan> pelangganFile = new DataFile<>("pelanggan.txt");
            pelangganFile.simpan(List.of(
                    new Pelanggan("C001", "Nadia"),
                    new Pelanggan("C002", "Raka")));

            DataFile<Transaksi> transaksiFile = new DataFile<>("transaksi.txt");
            transaksiFile.simpan(List.of(
                    new Transaksi("TRX-01", 15150000.0),
                    new Transaksi("TRX-02", 350000.0)));

            System.out.println("Data berhasil disimpan menggunakan NIO.2\n");
            produkFile.tampilkan();
            pelangganFile.tampilkan();
            transaksiFile.tampilkan();
        } catch (IOException e) {
            System.out.println("Gagal memproses file: " + e.getMessage());
        }
    }
}
