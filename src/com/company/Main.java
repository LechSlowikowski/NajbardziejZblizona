package com.company;

import java.util.Scanner;
/********************************************************
 * nazwa klasy: Main
 * parametry wejściowe: brak
 * wartość zwracana: brak
 * opis: Główna klasa uruchomienowa
 * autor: 89012345678
 * ****************************************************/
public class Main {
    static final int ILE_ELEMENTOW = 10;
    static int[] tablica = new int[ILE_ELEMENTOW];
    static int szukana;
    static int indeksNajbardziejZblizonej;
    static int najbardziejZblizony;

    /********************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - parametry przekazywane podczas uruchomienia
     * wartość zwracana: brak
     * opis: główna metoda uruchamiająca program
     * autor: 89012345678
     * ****************************************************/
    public static void main(String[] args) {
        Scanner daneWejsciowe = new Scanner(System.in);
        for (int i = 0; i < ILE_ELEMENTOW; i++) {
            System.out.print(" Podaj " + i + " element tablicy: ");
            tablica[i] = daneWejsciowe.nextInt();
        }
        System.out.print("Podaj wartość szukaną: ");
        szukana = daneWejsciowe.nextInt();

        NajbardziejZblizona najbardziejZblizona = new NajbardziejZblizona(tablica, szukana);
        indeksNajbardziejZblizonej = najbardziejZblizona.znajdzIndeks();
        najbardziejZblizony = tablica[indeksNajbardziejZblizonej];
        System.out.println("Wśród elementów tablicy" + najbardziejZblizona.toString());
        System.out.print("najbardziej zbliżonym elementem do " + szukana);
        System.out.print(" jest: " + najbardziejZblizony);
        System.out.println(" występujący na pozycji " + indeksNajbardziejZblizonej + 1);
    }
}
