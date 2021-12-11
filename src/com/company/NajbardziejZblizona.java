package com.company;

import java.util.Arrays;
/********************************************************
 * nazwa klasy: NajbardziejZblizona
 * parametry wejściowe: brak
 * wartość zwracana: brak
 * opis: Główna klasa wyszukujące w tablicy element najbardziej zbliżony
 * autor: 89012345678
 * ****************************************************/
public class NajbardziejZblizona {
    private int[] tablica;
    private int szukana;
    private int minRoznica;
    private int indeksSzukana;

    /********************************************************
     * nazwa funkcji: NajbardziejZblizona
     * parametry wejściowe: tablica - tablica przeszukiwanych elementów
     *                      szukana - element wyszukiwany
     * wartość zwracana: brak
     * opis: konstruktor klasy NajbardziejZblizona
     * autor: 89012345678
     * ****************************************************/
    public NajbardziejZblizona(int[] tablica, int szukana) {
        this.tablica = tablica;
        this.szukana = szukana;
    }

    /********************************************************
     * nazwa funkcji: znajdzIndeks
     * parametry wejściowe: brak
     * wartość zwracana: indeks najbardziej zbliżonego elementu
     * opis: wyszukuje w tablicy najbardziej zbliżony element do szukanego
     * autor: 89012345678
     * ****************************************************/
    public int znajdzIndeks() {
        this.minRoznica = Math.abs(this.tablica[0] - this.szukana);
        this.indeksSzukana = 0;
        for (int i = 1; i < this.tablica.length; i++) {
            int roznica = Math.abs(this.tablica[i] - this.szukana);
            if (roznica < this.minRoznica) {
                this.minRoznica = roznica;
                this.indeksSzukana = i;
            }
        }
        return this.indeksSzukana;
    }

    /********************************************************
     * nazwa funkcji: getMinRoznica
     * parametry wejściowe: brak
     * wartość zwracana: najmniej różniący się element
     * opis: zwraca element z tablicy, który się najmniej różni od szukanego
     * autor: 89012345678
     * ****************************************************/
    public int getMinRoznica() {
        return minRoznica;
    }

    /********************************************************
     * nazwa funkcji: getIndeksSzukana
     * parametry wejściowe: brak
     * wartość zwracana: indeks najmniej różniącego się elementu
     * opis: zwraca położenie w tablicy elementu, który się najmniej różni od szukanego
     * autor: 89012345678
     * ****************************************************/
    public int getIndeksSzukana() {
        return indeksSzukana;
    }

    /********************************************************
     * nazwa funkcji: toString
     * parametry wejściowe: brak
     * wartość zwracana: napis zawierający elementy tablicy oddzielone przecinkami
     * opis: zwraca napis zawierający elementy tablicy oddzielone przecinkami
     * autor: 89012345678
     * ****************************************************/
    @Override
    public String toString() {
        return Arrays.toString(tablica);
    }
}
