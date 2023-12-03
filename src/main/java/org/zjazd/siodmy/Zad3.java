package org.zjazd.siodmy;

public class Zad3 {

    static <T>T f(I5<T> i, T[] array, T obj) {
        return i.c(array, obj);
    }


    static <T> String countMatching(T[] array, T obj) {
        int count = 0;
        for (T t : array) {
            if(t.equals(obj)) {
                count++;
            }
        }
        return String.valueOf(count);
    }

    public static void main(String[] args) {
        String s = "1";
        String[] stringArray = new String[] {"", "", "", s};

        I5<String> lambda1 = Zad3::countMatching;

        Integer i = 10;
        Integer[] intArray = new Integer[] {2,3,4,5,6,7,8,i};

        I5<Integer> lambda2 = (array1, obj) -> {
            int count = 0;
            for (Integer t : array1) {
                if (obj > t) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(f(lambda1, stringArray, s));
        System.out.println(f(lambda2, intArray, i));
    }
}

interface I5 <T> {

   T c(T[] array, T obj);
}

