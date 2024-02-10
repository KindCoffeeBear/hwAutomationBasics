package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashbackHack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotCalculateCashbackHackIfAmountMultipleOf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateCashbackHackJunitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldNotCalculateCashbackHackIfAmountMultipleOf1000JunitJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}