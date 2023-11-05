package org.zjazd.czwarty.z3.x;

import static java.lang.Math.*;
class a {
    int i = 1;
    static int j = 1;
    static void  f() {
        j++;
    }
}

class b extends a {
    static void f() {
        j=10;
    }
}

public class f {
    public static void main(String[] args) {
        //1
//        System.out.println(a.j++);
//
//        a a1 = new a();
//        a a2 = new a();
//
//        System.out.println(a1.j++);
//        System.out.println(a2.j++);
//        a.f();
//        a1.f();
//        a2.f();
//        System.out.println(a.j);

        //2
//        System.out.println(sqrt(4) + " " + pow(2,3));

        //3
//        Integer i = 10, j = 10;
//        System.out.println(i == j);
//
//        Integer k = 100000, l = 100000;
//        System.out.println(k == l);
        //returns true and false
        Integer i = 10, j = 10;
        System.out.println(i.equals(j));

        Integer k = 100000, l = 100000;
        System.out.println(k.equals(l));
        //returns true and true
    }

}
