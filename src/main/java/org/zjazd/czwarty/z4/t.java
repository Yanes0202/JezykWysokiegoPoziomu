package org.zjazd.czwarty.z4;

public class t <T> {
    T a;
    T[] b;
    t(T t) {
        a = t;
    }
    T getA() { return a;}
}

class Main {
    public static void main(String[] args) {
        t<Integer> t1 = new t<>(5);
        System.out.println(t1.getA());

        t<String> t2 = new t<>("abc");
        System.out.println(t2.getA());

        // można też zamiast typu generycznego wykorzysztać klasę Object
    }
}
