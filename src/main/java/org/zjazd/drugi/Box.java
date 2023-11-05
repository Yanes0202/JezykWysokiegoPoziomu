package org.zjazd.drugi;

public class Box {
    double d, w, h;

    Box() {d = 1; w = 1; h = 1;}

    Box(double a) {d = a; w = a; h = a;}

    Box(double d, double w, double h) {
        this.d = d;
        this.w = w;
        this.h = h;
    }
    Box(Box box) {
        d = box.d;
        w = box.w;
        h = box.h;
    }
}

class BoxColor extends Box {
    String color;

    BoxColor(String color) {this.color = color;}
    BoxColor(double a) {super(a); color = "green";}
    BoxColor(double d, double w, double h) {super(d,w,h); color = "red";}
    BoxColor(BoxColor boxColor) {super(boxColor); color = boxColor.color;}

    void getVariables() {
        System.out.println(color + " " + super.d + " " + super.w + " " + super.h);
    }
}

class Base {
    public static void main(String[] args) {
        BoxColor boxColor1 = new BoxColor("yellow");
        BoxColor boxColor2 = new BoxColor(10);
        BoxColor boxColor3 = new BoxColor(2, 3, 4);
        BoxColor boxColor4 = new BoxColor(boxColor1);

        boxColor1.getVariables();
        boxColor2.getVariables();
        boxColor3.getVariables();
        boxColor4.getVariables();
    }
}
