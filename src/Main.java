public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 48; //вес в кг
        double height = 1.50; //рост в м
        double bmi = service.calculate(weight, height);

        System.out.println("Ваш Индекс Массы Тела равен " + bmi);
    }
}
