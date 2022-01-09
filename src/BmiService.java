public class BmiService {
    public double calculate(double height, int weight) { //определяем метод calculate

        double bmi = weight / (height * height);// Расчет индекса массы тела
        return bmi;
    }
}