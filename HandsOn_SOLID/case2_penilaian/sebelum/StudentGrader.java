public class StudentGrader {
    public double calculateGrade(String type, double score) {
        if (type.equals("TUGAS")) {
            return score * 0.3;
        } else if (type.equals("UTS")) {
            return score * 0.3;
        } else if (type.equals("UAS")) {
            return score * 0.4;
        } else {
            throw new IllegalArgumentException("Tipe penilaian tidak dikenali");
        }
    }

    public static void main(String[] args) {
        StudentGrader grader = new StudentGrader();
        System.out.println(grader.calculateGrade("UAS", 90));
        System.out.println(grader.calculateGrade("PROYEK", 85));
    }
}