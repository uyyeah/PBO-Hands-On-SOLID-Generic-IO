public class UtsGrading implements GradingStrategy {
    @Override
    public double calculate(double score) {
        return score * 0.3;
    }
}