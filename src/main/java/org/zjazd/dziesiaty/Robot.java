package org.zjazd.dziesiaty;

import java.util.Arrays;
import java.util.List;

public class Robot {
    GridPosition gridPosition;
    Orienatation orienatation;

    Robot(GridPosition gridPosition, Orienatation orientation) {
            this.gridPosition = gridPosition;
            this.orienatation = orientation;
    }

    public void simulate(char action) {
        if (action == 'L') {
                if (orienatation.ordinal() == 0) {
                    orienatation = Orienatation.values()[3];
                } else {
                    orienatation = Orienatation.values()[orienatation.ordinal() - 1];
                }
        } else if (action == 'R') {
            if (orienatation.ordinal() == 3) {
                orienatation = Orienatation.values()[0];
            } else {
                orienatation = Orienatation.values()[orienatation.ordinal() + 1];
            }
        } else {
            switch (orienatation) {
                case EAST:
                    gridPosition.x--;
                    break;
                case WEST:
                    gridPosition.x++;
                    break;
                case SOUTH:
                    gridPosition.y++;
                    break;
                default:
                    gridPosition.y--;

            }
        }
    }

    public static void main(String[] args) {
        char[] action = {'F', 'F', 'L', 'F', 'F', 'R', 'F', 'F', 'L', 'F', 'F', 'F', 'F'};

        GridPosition inicialGridPosition = new GridPosition(50, 50);
        Orienatation inicialOrientation = Orienatation.NORTH;
        Robot robot = new Robot(inicialGridPosition, inicialOrientation);

        String[][] map = new String[100][100];
        for (String[] strings : map) {
            Arrays.fill(strings, "*");
        }
        map[robot.gridPosition.y][robot.gridPosition.x] = "s";



        for (char act : action) {
            robot.simulate(act);
            map[robot.gridPosition.y][robot.gridPosition.x] = "x";
        }

        for (String[] strings : map) {
            System.out.println();
            for (String string : strings) {
                System.out.print(string);
            }
        }

    }


}

enum Orienatation {
    NORTH,
    WEST,
    SOUTH,
    EAST
}

class GridPosition {
    int x, y;
    GridPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}