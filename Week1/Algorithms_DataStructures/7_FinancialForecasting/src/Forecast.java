public class Forecast {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue,
                                     double growthRate,
                                     int years) {

        if (years == 0)
            return presentValue;

        return futureValue(presentValue,
                           growthRate,
                           years - 1) * (1 + growthRate);
    }

    // Recursive Power Method
    public static double power(double base, int exponent) {

        if (exponent == 0)
            return 1;

        return base * power(base, exponent - 1);
    }

    // Formula Method
    public static double futureValueFormula(double presentValue,
                                            double growthRate,
                                            int years) {

        return presentValue * power((1 + growthRate), years);
    }
}