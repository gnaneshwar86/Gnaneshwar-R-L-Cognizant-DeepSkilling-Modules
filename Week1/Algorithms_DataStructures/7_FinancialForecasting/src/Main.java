import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Financial Forecasting =====");

        System.out.print("Enter Present Value : ");
        double presentValue = sc.nextDouble();

        System.out.print("Enter Growth Rate (%) : ");
        double growthRate = sc.nextDouble() / 100;

        System.out.print("Enter Number of Years : ");
        int years = sc.nextInt();

        double recursiveResult =
                Forecast.futureValue(presentValue,
                        growthRate,
                        years);

        double formulaResult =
                Forecast.futureValueFormula(presentValue,
                        growthRate,
                        years);

        System.out.println();

        System.out.printf("Future Value (Recursive) : %.2f%n",
                recursiveResult);

        System.out.printf("Future Value (Formula) : %.2f%n",
                formulaResult);
    }
}