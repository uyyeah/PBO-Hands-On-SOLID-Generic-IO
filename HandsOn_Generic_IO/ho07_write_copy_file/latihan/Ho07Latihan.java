import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Ho07Latihan {
    private static final Path LOG_FILE = Paths.get("log.txt");
    private static final DateTimeFormatter FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    static void tulisLog(String status, String pesan) {
        String baris = "[" + LocalDateTime.now().format(FORMAT) + "] " + status + " " + pesan;
        System.out.println(baris);
        try {
            Files.write(LOG_FILE, List.of(baris),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Gagal menulis log: " + e.getMessage());
        }
    }

    static void backup(Path source, Path backup) {
        if (!Files.exists(source)) {
            tulisLog("GAGAL", source + " tidak ditemukan, backup dibatalkan");
            return;
        }
        try {
            if (Files.notExists(backup.getParent())) {
                Files.createDirectories(backup.getParent());
            }
            Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
            tulisLog("SUKSES", "menyalin " + source + " ke " + backup);
        } catch (IOException e) {
            tulisLog("ERROR", e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Files.deleteIfExists(LOG_FILE); 

        Path report = Paths.get("report.txt");
        Files.write(report, List.of("Report Generated", "Status: OK"));

        backup(report, Paths.get("backup", "report.txt"));  
        backup(Paths.get("laporan_lama.txt"), Paths.get("backup", "laporan_lama.txt"));

        System.out.println("\n=== Isi log.txt ===");
        Files.readAllLines(LOG_FILE).forEach(System.out::println);
    }
}
