package tests;

import methods.Rate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// junit version: 5.4.2
public class RateTest {
    @Test
    public void testPositiveComputeInterestRate() throws Exception {
        // Positive Test Cases
        assertEquals(1.0, Rate.computeInterestRate(0, 2));
        assertEquals(3.5, Rate.computeInterestRate(0, 4));
        assertEquals(4.5, Rate.computeInterestRate(0, 7));
        assertEquals(5.0, Rate.computeInterestRate(1, 0));
        assertEquals(5.5, Rate.computeInterestRate(2, 0));
    }

    @Test
    public void testNegativeComputeInterestRate() throws Exception {
        // Negative Test Cases
        assertEquals(-1.0, Rate.computeInterestRate(-1, 0));
        assertEquals(-1.0, Rate.computeInterestRate(0, 12));
    }
}
