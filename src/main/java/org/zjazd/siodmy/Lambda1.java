package org.zjazd.siodmy;

public class Lambda1 {
    public static void main(String[] args) {
        //1
/**        I lambda = (int i) -> i*i;

        I lambda2 = x -> x*x*x;

        System.out.println(lambda.f(10));

        System.out.println(lambda2.f(10));*/

        //2
/**        I lambda = (x, y) -> x > y;

        System.out.println(lambda.f(2,1));
        System.out.println(lambda.f(1,2));*/
    }
}

interface I {
    //1
/**    int f(int i);*/

    //2
/**    boolean f(int i, int j);*/

}