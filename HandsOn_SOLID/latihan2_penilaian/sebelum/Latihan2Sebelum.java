class StudentGraderSebelum {
    public double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    public void cetakLaporan(String nama, double nilai) {
        System.out.println("Laporan Nilai Mahasiswa: " + nama + " = " + nilai);
    }

    public void simpanDatabase(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}

public class Latihan2Sebelum {
    public static void main(String[] args) {
        StudentGraderSebelum grader = new StudentGraderSebelum();
        double nilai = grader.hitungNilaiAkhir(80, 85, 90);
        grader.cetakLaporan("Andi", nilai);
        grader.simpanDatabase("Andi", nilai);
    }
}