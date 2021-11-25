package ru.netology.unit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BonusServiceTest {
    @Test
    public void shouldReturn10IfAmountIs2000() {
        BonusService service = new BonusService();
        int amount = 2000;

        int actual = service.calculateBonus(amount);
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountLowerThan1000() {
        BonusService service = new BonusService();
        int amount = 900;

        int actual = service.calculateBonus(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroIfAmountLowerThan1000() {
        BonusService service = new BonusService();
        int amount = 1000;

        int actual = service.calculateBonus(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}