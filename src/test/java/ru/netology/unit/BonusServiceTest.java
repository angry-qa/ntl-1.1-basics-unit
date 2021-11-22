package ru.netology.unit;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class BonusServiceTest {
    @Test
    void shouldReturn10IfAmountIs2000() {
        BonusService service = new BonusService();
        int amount = 2000;

        int actual = service.calculateBonus(amount);
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnZeroIfAmountLowerThan1000() {
        BonusService service = new BonusService();
        int amount = 900;

        int actual = service.calculateBonus(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}