public class Main<bmi> {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        float height;
        float bmi = BmiService.calculate(56, (float) 1.65);
        System.out.println(bmi);
    }
}
