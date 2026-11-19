import java.io.*;

public class Ho07Sebelum {
    public static void main(String[] args) {
        File report = new File("report.txt");
        File backup = new File("backup_report.txt");
        try {
            FileWriter writer = new FileWriter(report);
            writer.write("Report Generated\nStatus: OK");
            writer.close();

            FileInputStream fis = new FileInputStream(report);
            FileOutputStream fos = new FileOutputStream(backup);
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            fis.close();
            fos.close();
            System.out.println("Backup berhasil dibuat.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}