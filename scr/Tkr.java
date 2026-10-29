public class Tkr {

    // Базовий розрахунок (без знижки)
    public double calculatePrice(double basePrice) {
        return basePrice;
    }

    // Розрахунок з урахуванням фіксованої знижки
    public double calculatePrice(double basePrice, double discount) {
        return basePrice - discount;
    }

    // Розрахунок з урахуванням знижки та промокоду (у відсотках)
    public double calculatePrice(double basePrice, double discount, boolean hasPromo) {
        double finalPrice = basePrice - discount;
        if (hasPromo) {
            finalPrice = finalPrice * 0.9; // Додаткові 10% знижки
        }
        return finalPrice;
    }

    public static void main(String[] args) {
        Tkr demo = new Tkr();

        System.out.println(demo.calculatePrice(500.0));
        System.out.println(demo.calculatePrice(500.0, 50.0));
        System.out.println(demo.calculatePrice(500.0, 50.0, true));
    }
}