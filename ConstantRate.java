public class ConstantRate {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 58.75; // USD to PHP
        double usdAmount = 100;

        double pesoAmount = usdAmount * EXCHANGE_RATE;

        System.out.printf("USDAmount: $%.2f%n", usdAmount);
        System.out.println("Exchange rate: " + EXCHANGE_RATE + " PHP per USD");
        System.out.printf("Peso Equivalent: %.2f PHP%n", pesoAmount);
    }
}