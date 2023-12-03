package org.zjazd.czwarty.z4;
    //1
/**
public class t <T> {
    T a;
    T[] b;
//    t(T t) { a = t; }
    T getA() { return a;}
}
 */

    //2
/**
class u <U,T> extends t <T> {
}

class u <U,V> extends t <Integer> {
}
 */


    //2
/**class t2 {
    Object a;
    Object[] b;

    t2(Object t) {
        a = t;
    }
    Object getA() {
        return a;
    }
}*/

//3

import org.zjazd.czwarty.z1.b.B;

/**
public interface t <T>{
}

class u <U,T> implements t <T> {

}
 */

    //4
class t {
    <T> T f(T t) {return t;}

    static <T> T fst(T t) {return t;}
}

class T<T> {
}

class Book {
    int id;
}

class Main {
    public static void main(String[] args) {
        //1
/**
        t<Integer> t1 = new t<>(5);
        System.out.println(t1.getA());

        t<String> t2 = new t<>("abc");
        System.out.println(t2.getA());
*/

        //2
        // można też zamiast typu generycznego wykorzysztać klasę Object
/**
        t2 i = new t2(1);
        Integer j = (Integer) i.getA();

        t2 s = new t2("abc");
        String w = (String) s.getA();
 */
        //3
//        u<Integer, String> u = new u<>();

        //4
        Book b = new Book();
        b.id = 9;
        System.out.println(t.fst(b).id);

        T s = new T();

        t obt = new t();

        System.out.println(obt.<T>f(s));
    }
}

