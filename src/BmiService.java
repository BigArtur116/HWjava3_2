public class BmiService {
    public int calculate(int weight, double height) {

        double heightM = height * height;
        double result = (double) weight / heightM;
        return (int) result;
    }
}
