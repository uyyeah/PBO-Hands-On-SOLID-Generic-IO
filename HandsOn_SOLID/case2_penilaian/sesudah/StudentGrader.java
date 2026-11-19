public class StudentGrader {
    private GradingStrategy strategy;

    public StudentGrader(GradingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateGrade(double score) {
        return strategy.calculate(score);
    }

    public static void main(String[] args) {
        StudentGrader grader = new StudentGrader(new UasGrading());
        System.out.println("Nilai akhir: " + grader.calculateGrade(85));

        GradingStrategy[] strategies = {
            new TugasGrading(),
            new UtsGrading(),
            new UasGrading(),
            new ProyekGrading()
        };

        for (GradingStrategy s : strategies) {
            StudentGrader g = new StudentGrader(s);
            System.out.printf("%-15s skor 85 -> %.2f%n", s.getClass().getSimpleName(), g.calculateGrade(85));
        }
    }
}