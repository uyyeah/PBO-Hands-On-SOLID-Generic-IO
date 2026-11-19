public class TugasGrading implements GradingStrategy {
    @Override
    public double calculate(double score) {
        return score * 0.3;
    }
}