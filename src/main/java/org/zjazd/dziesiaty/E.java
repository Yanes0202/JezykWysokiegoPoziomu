package org.zjazd.dziesiaty;

public class E {
    public static void main(String[] args) {
        User user = new User();
        user.status = UserStatus.ACTIVE;
        System.out.println(user.status.name());
        System.out.println(user.status.ordinal());

        for (UserStatus u : UserStatus.values()) System.out.println(u + " " + u.ordinal());
    }
}

enum UserStatus {
    PENDING,
    ACTIVE,
    BLOCKED
}

class User {
    String name;
    UserStatus status = UserStatus.PENDING;
}
