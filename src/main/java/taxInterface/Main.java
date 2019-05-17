package taxInterface;

public class Main {
    public static void main(String[] args) {
        final StampDuty stampDutyCalculator = new StampDuty(
                new TaxBand(120.0f, 0.005f), // half a percent if over 120k
                new TaxBand(250.0f, 0.005f)); // another half a percent if over 250k

        float houseSaleAmount = 150.0f;
        float stampDuty = stampDutyCalculator.calculateTax(houseSaleAmount);

        System.out.println(
                String.format("The stamp duty on %.02f is %.02f", houseSaleAmount, stampDuty));

        final TaxCalculator incomeTaxCalculator = new TaxCalculator(
                new TaxBand(22.0f, 0.10f), // 10% on anything over 22k
                new TaxBand(50.0f, 0.15f) // another 15% on anything over 50k, OR 25% on the 'over 50k bit'
        );
        float income = 75.0f;
        float incomeTax = incomeTaxCalculator.calculateTax(income);
        System.out.println(
                String.format("The income tax on %.02f is %.02f", income, incomeTax));
    }
}
