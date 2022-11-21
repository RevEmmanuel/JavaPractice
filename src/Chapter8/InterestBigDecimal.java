package Chapter8;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class InterestBigDecimal {

    public static void main(String[] args) {
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%4s%15s%n", "Year", "Amount");
        for (int year = 1; year <= 10; year++) {
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%4d%15s%n", year, NumberFormat.getCurrencyInstance().format(amount));
            System.out.printf("%4d%15s%n",year, NumberFormat.getCurrencyInstance().format(amount.setScale(2, RoundingMode.HALF_EVEN)));
        }
    }
}
