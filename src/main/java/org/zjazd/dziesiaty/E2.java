package org.zjazd.dziesiaty;

import lombok.Getter;

public class E2 {
    public static void main(String[] args) {
        Battery battery = new Battery(ChargeLevel.LOW, 1);
        System.out.println(battery.chargeLevel.getLevel());
        System.out.println(battery.chargeLevel.getColor());

        for (ChargeLevel u : ChargeLevel.values()) {
            System.out.println(u + " " + u.getLevel() + " " + u.ordinal());
        }
    }
}


@Getter
enum ChargeLevel {
    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    private final int level;
    private final String color;

    ChargeLevel(int level, String color) {
        this.level = level;
        this.color = color;
    }
}

class Battery {
    int id;
    ChargeLevel chargeLevel;

    Battery(ChargeLevel chl, int id) {
        this.id = id;
        this.chargeLevel = chl;
    }
}