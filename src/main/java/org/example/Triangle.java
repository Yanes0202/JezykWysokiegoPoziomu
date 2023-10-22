package org.example;

public class Triangle {
    double l, r, h;
    Triangle(double l, double r, double h) {
        this.l = l;
        this.r = r;
        this.h = h;
    }
    boolean isRectang() {
        if (l * l + r * r == h * h) {
            return true;
        } else if(l * l + h * h == r * r) {
            return true;
        } else return h * h + r * r == l * l;
    }

    double getPerim() {
        return l + r + h;
    }
}
