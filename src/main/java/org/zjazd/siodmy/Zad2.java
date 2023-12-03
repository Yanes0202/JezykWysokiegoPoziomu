package org.zjazd.siodmy;

public class Zad2 {

    // int -> false albo true jesli parzysta

    // 2 lambda sprawdza czy to liczba dodatnia

    // 3 lambda ma 2 wy wyrazenia zwraca bool i sprawdza czy podzielne


    public static void main(String[] args) {
        //parzysta
        I1 lambda1 = (int x) -> x % 2 == 0;

        //dodatnia
        I1 lambda2 = (int x) -> x > 0;

        //podzielne
        I2 lambda3 = (int x, int y) -> x % y == 0;

        System.out.println("Parzysta: " + lambda1.m1(2));
        System.out.println("Parzysta: " + lambda1.m1(1));
        System.out.println();

        System.out.println("Dodatnia: " + lambda2.m1(2));
        System.out.println("Dodatnia: " + lambda2.m1(-2));
        System.out.println();

        System.out.println("Podzielna: " + lambda3.m2(2, 1));
        System.out.println("Podzielna: " + lambda3.m2(1, 2));

    }
}

interface I1 {
    boolean m1(int i);
}

interface I2 {
    boolean m2(int i, int j);
}
