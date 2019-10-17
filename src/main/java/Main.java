public class Main {
    public static void main(String[] args) {
        int taxiBoardingAmountInRub = 100;
        int fareForOneKmInRub = 10;
        int distanceInKm = 200;

        TaxiService taxiService = new TaxiService();
        System.out.println(taxiService.calculate(taxiBoardingAmountInRub, fareForOneKmInRub, distanceInKm));
    }
}
