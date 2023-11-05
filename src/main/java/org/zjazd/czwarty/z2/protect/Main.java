package org.zjazd.czwarty.z2.protect;

import org.zjazd.czwarty.z2.protect.b.c.*;

class A extends C {
    void a() {
        System.out.println("a");
        b();
        c();
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.a();
    }
}
