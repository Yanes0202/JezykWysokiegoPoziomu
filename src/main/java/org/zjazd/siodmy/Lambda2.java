package org.zjazd.siodmy;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda2 {

    static int g(I4 i, int j) {
        return i.f(j);
    }

    public static void main(String[] args) {
        Function<Integer, Integer> lambda = x -> x*x;
        System.out.println(lambda.apply(2));

        BiFunction<Boolean, Boolean, String> lambda2 = (Boolean a, Boolean b) -> "OK";
        System.out.println(lambda2.apply(false, true));

        I4 lambda3 = (int x) -> x * x;
        System.out.println(g(lambda3, 5));

        System.out.println(g(x -> x * x * x, 5));

        I4 lambda4 = x -> H.h(x);
        System.out.println(g(lambda4, 2));
        //to to samo
        I4 lambda5 = H::h;
        System.out.println(g(lambda5, 2));

    }
}

interface I4 {
    int f(int i);
}

class H {
    static int h(int i) {
        return i*i;
    }
}
