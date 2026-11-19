interface GradeCalculator {
    double hitungNilaiAkhir(double tugas, double uts, double uas);
}

interface GradeRepository {
    void simpan(String nama, double nilai);
}

interface ReportPrinter {
    void cetakLaporan(String nama, double nilai);
}

class WeightedGradeCalculator implements GradeCalculator {
    @Override
    public double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

class ConsoleReportPrinter implements ReportPrinter {
    @Override
    public void cetakLaporan(String nama, double nilai) {
        System.out.println("Laporan Nilai Mahasiswa: " + nama + " = " + nilai);
    }
}

class DatabaseGradeRepository implements GradeRepository {
    @Override
    public void simpan(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}

class FileGradeRepository implements GradeRepository {
    @Override
    public void simpan(String nama, double nilai) {
        System.out.println("Menyimpan ke file: " + nama + " = " + nilai);
    }
}

public class Latihan2Sesudah {
    public static void main(String[] args) {
        GradeCalculator calculator = new WeightedGradeCalculator();
        ReportPrinter printer = new ConsoleReportPrinter();
        GradeRepository dbRepo = new DatabaseGradeRepository();
        GradeRepository fileRepo = new FileGradeRepository();

        double nilai = calculator.hitungNilaiAkhir(80, 85, 90);
        printer.cetakLaporan("Andi", nilai);
        dbRepo.simpan("Andi", nilai);
        fileRepo.simpan("Andi", nilai);
    }
}