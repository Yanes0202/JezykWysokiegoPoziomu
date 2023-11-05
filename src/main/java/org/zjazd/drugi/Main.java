package org.zjazd.drugi;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5,4,3);
        Triangle triangle2 = new Triangle(3,3,3);

        System.out.println(triangle1.isRectang());
        System.out.println(triangle1.getPerim());

        System.out.println(triangle2.isRectang());
        System.out.println(triangle2.getPerim());
    }
}