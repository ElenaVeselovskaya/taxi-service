public class TaxiService {
    int taxiBoardingAmountInRub;
    int fareForOneKmInRub;
    int distanceInKm;
    int amountOfOrderForDiscountInRub = 1_000;
    int fivePerSentDiscount = 5;
    int hundredPerSent = 100;
    int limitOfDiscountInRub = 100;


    int calculate(int taxiBoardingAmountInRub, int fareForOneKmInRub, int distanceInKm) {
        int amountOfOrderInRub = taxiBoardingAmountInRub + distanceInKm * fareForOneKmInRub;
        int amountOfDiscountInRub = amountOfOrderInRub * fivePerSentDiscount / hundredPerSent;

        if (amountOfOrderInRub > amountOfOrderForDiscountInRub & amountOfDiscountInRub > limitOfDiscountInRub) {
            return (amountOfOrderInRub - limitOfDiscountInRub);
        } else if (amountOfOrderInRub > amountOfOrderForDiscountInRub & amountOfDiscountInRub < limitOfDiscountInRub) {
            return (amountOfOrderInRub - amountOfDiscountInRub);
        } else {
            return amountOfOrderInRub;
        }
    }
}
