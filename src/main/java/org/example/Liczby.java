package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Liczby {

    private String plik;
    private List<String> wiersz;

    public Liczby(String plik) {
        this.plik = plik;
    }

    public void wczytanieDanych() {
        try {
            wiersz = Files.readAllLines(Paths.get(plik));
        } catch (IOException e) {
            System.out.println("Błąd wczytywania pliku: " + e.getMessage());
        }
    }

    public int szukaniePierwszejIOstatniej() {
        int suma = 0;

        for (String line : wiersz) {
            int pierwsza = -1;
            int ostatnia = -1;

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (Character.isDigit(c)) {
                    if (pierwsza == -1) {
                        pierwsza = c - '0';
                    }
                    ostatnia = c - '0';
                }
            }

            if (pierwsza != -1 && ostatnia != -1) {
                int liczba = pierwsza * 10 + ostatnia;
                System.out.println("Z wiersza: " + line + " utworzono liczbę: " + liczba);
                suma += liczba;
            }
        }

        return suma;
    }

    public int liczenieSumy() {
        return szukaniePierwszejIOstatniej();
    }
}
