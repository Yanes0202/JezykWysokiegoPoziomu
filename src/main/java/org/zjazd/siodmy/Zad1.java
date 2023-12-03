package org.zjazd.siodmy;

public class Zad1 {


    static <T> boolean contains(T[] array, T obj) {
        for ( T t : array) {
            if(t.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "";

        String[] cs = new String[]{s};

        System.out.println(Zad1.contains(cs, s));
    }
}