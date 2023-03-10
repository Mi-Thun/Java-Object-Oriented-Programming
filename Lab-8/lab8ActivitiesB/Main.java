package lab8ActivitiesB;

import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            String x = input.next();
            int y = input.nextInt();
            players.add(new Player(x, y));
        }
        Collections.sort(players);
        for (Player pt : players) {
            System.out.println(pt.name + " " + pt.score);
        }
    }
}

class Player implements Comparable<Player> {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Player pt) {
        if (score == pt.score)
            return 0;
        else if (score < pt.score)
            return 1;
        else
            return -1;
    }
}


