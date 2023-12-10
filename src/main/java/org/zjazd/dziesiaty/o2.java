package org.zjazd.dziesiaty;

public class o2 {
    public static void main(String[] args) {
        X x = new Y();
        x.f();
        System.out.println(x.i);
    }
}

class X {
    int i = 1;
    void f() {
        System.out.println(1);
    }
}

class Y extends X {
    int i =2;
    void f() {
        System.out.println(2);
    }
}

