package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiczbyTest {

    private Liczby liczby;

    @BeforeEach
    public void setUp() {
        liczby = new Liczby("dummy.txt");
    }

    @Test
    public void testSumowanieLiczb() {
        List<String> dane = Arrays.asList("1bc2", "abc3", "xyz4", "5pqr6");
        liczby.wiersz = dane;
        int suma = liczby.liczenieSumy();
        assertEquals(145, suma);
    }

    @Test
    public void testBrakCyfr() {
        List<String> dane = Arrays.asList("abc", "xyz", "def");
        liczby.wiersz = dane;
        int suma = liczby.liczenieSumy();
        assertEquals(0, suma);
    }

    @Test
    public void testTylkoJednaCyfra() {
        List<String> dane = Arrays.asList("a1", "b2", "c3");
        liczby.wiersz = dane;
        int suma = liczby.liczenieSumy();
        assertEquals(66, suma);
    }

    @Test
    public void testPusteLinie() {
        List<String> dane = Arrays.asList("", "", "");
        liczby.wiersz = dane;
        int suma = liczby.liczenieSumy();
        assertEquals(0, suma);
    }

    @Test
    public void testJednaCyfraWielokrotnie() {
        List<String> dane = Arrays.asList("a1", "2b", "3c", "d4");
        liczby.wiersz = dane;
        int suma = liczby.liczenieSumy();
        assertEquals(10, suma);
    }
}
