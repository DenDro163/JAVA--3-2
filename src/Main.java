public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();// Создаем объект из класса
        double height = 1.8;// Рост в метрах
        int weight = 100;// Вес в килограммах

        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}

