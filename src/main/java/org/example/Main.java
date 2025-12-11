package org.example;



public class Main {
    public static void main(String[] args) {
        String filePath = "src/liczby.txt";

        Liczby liczby = new Liczby(filePath);
        liczby.wczytanieDanych();
        liczby.szukaniePierwszejIOstatniej();
        System.out.println(liczby.liczenieSumy());
    }
}
