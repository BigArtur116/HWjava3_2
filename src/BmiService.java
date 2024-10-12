public class BmiService {
    public int calculate() {
        double height = 1.87;
        double heightM = height * height;
        int weight = 98;
        double result = (double) weight / heightM;
        return (int) result;
    }
}
