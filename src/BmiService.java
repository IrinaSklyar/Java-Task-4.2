public class BmiService<bmi> {
    public static float calculate(int weight, float height) {
        float bmi = weight / (height * height);
        return bmi;
    }
}


