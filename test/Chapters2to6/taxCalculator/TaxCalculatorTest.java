package Chapters2to6.taxCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    private Citizen henry;
    private Citizen ayo;
    private Citizen paragon;

    @BeforeEach
    void setUp() {
        henry = new Citizen();
        henry.setFirstName("Henry");
        henry.setLastName("Okafor");
        henry.setEarnings(BigDecimal.valueOf(17000));

        ayo = new Citizen("Uncle A", "Adeboye", BigDecimal.valueOf(100000));
        ayo.setFirstName("Ayodele");

        paragon = new Citizen("Paragon", "C13");
        paragon.setEarnings(new BigDecimal(70000));

    }

    @Test
    void calculateTax() {
        BigDecimal henryTax = new BigDecimal(2550);
        assertEquals(henryTax.doubleValue(), TaxCalculator.calculateTax(henry).doubleValue());
    }

    @Test
    void calculateExcessTax() {
        BigDecimal ayoTax = new BigDecimal(18500);
        assertEquals(ayoTax.doubleValue(), TaxCalculator.calculateTax(ayo).doubleValue());

        BigDecimal paragonTax = new BigDecimal(12500);
        assertEquals(paragonTax.doubleValue(), TaxCalculator.calculateTax(paragon).doubleValue());
    }

}
