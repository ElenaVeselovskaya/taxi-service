import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxiServiceTest {

    @Test
    void verifyCalculationWithLimitDiscount() {
        TaxiService taxiService = new TaxiService();
        int taxiBoardingAmountInRub = 100;
        int fareForOneKmInRub = 10;
        int distanceInKm = 200;
        int actualSumOfOrder = taxiService.calculate(taxiBoardingAmountInRub, fareForOneKmInRub, distanceInKm);
        int expectedSumOfOrder = 2_000;
        Assertions.assertEquals(expectedSumOfOrder, actualSumOfOrder);
    }

    @Test
    void verifyCalculationWithDiscount() {
        TaxiService taxiService = new TaxiService();
        int taxiBoardingAmountInRub = 100;
        int fareForOneKmInRub = 10;
        int distanceInKm = 100;
        int actualSumOfOrder = taxiService.calculate(taxiBoardingAmountInRub, fareForOneKmInRub, distanceInKm);
        int expectedSumOfOrder = 1_045;
        Assertions.assertEquals(expectedSumOfOrder, actualSumOfOrder);
    }

    @Test
    void verifyCalculationWithoutDiscount() {
        TaxiService taxiService = new TaxiService();
        int taxiBoardingAmountInRub = 100;
        int fareForOneKmInRub = 10;
        int distanceInKm = 10;
        int actualSumOfOrder = taxiService.calculate(taxiBoardingAmountInRub, fareForOneKmInRub, distanceInKm);
        int expectedSumOfOrder = 200;
        Assertions.assertEquals(expectedSumOfOrder, actualSumOfOrder);
    }
}