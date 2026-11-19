import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Ho07Sesudah {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path backup = Paths.get("backup/report.txt");
        try {
            Files.write(source, List.of("Report Generated", "Status: OK"));
            if (Files.notExists(backup.getParent())) {
                Files.createDirectories(backup.getParent());
            }
            Files.copy(source, backup, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Backup created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}