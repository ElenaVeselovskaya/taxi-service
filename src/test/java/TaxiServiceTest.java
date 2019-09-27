import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxiServiceTest {

    @Test
    void verifyCalculationWithLimitDiscount() {
        TaxiService sumOfOrder = new TaxiService();
        int taxiBoardingAmountInRub = 100;
        int fareForOneKmInRub = 10;
        int distanceInKm = 200;
        int actualSumOfOrder = sumOfOrder.calculate(taxiBoardingAmountInRub, fareForOneKmInRub, distanceInKm);
        int expectedSumOfOrder = 2_000;
        Assertions.assertEquals(expectedSumOfOrder, actualSumOfOrder);
    }

    @Test
    void verifyCalculationWithDiscount() {
        TaxiService sumOfOrder = new TaxiService();
        int taxiBoardingAmountInRub = 100;
        int fareForOneKmInRub = 10;
        int distanceInKm = 100;
        int actualSumOfOrder = sumOfOrder.calculate(taxiBoardingAmountInRub, fareForOneKmInRub, distanceInKm);
        int expectedSumOfOrder = 1_045;
        Assertions.assertEquals(expectedSumOfOrder, actualSumOfOrder);
    }

    @Test
    void verifyCalculationWithoutDiscount() {
        TaxiService sumOfOrder = new TaxiService();
        int taxiBoardingAmountInRub = 100;
        int fareForOneKmInRub = 10;
        int distanceInKm = 10;
        int actualSumOfOrder = sumOfOrder.calculate(taxiBoardingAmountInRub, fareForOneKmInRub, distanceInKm);
        int expectedSumOfOrder = 200;
        Assertions.assertEquals(expectedSumOfOrder, actualSumOfOrder);
    }
}