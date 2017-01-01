package crackingthecodinginterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-comparator-sorting
 * Created by dinu on 12/31/16.
 */
public class SortingComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
class Checker implements Comparator<Player> {

    public int compare(Player player1, Player player2){
        if(player1.score > player2.score){
            return -1;
        }
        if(player1.score < player2.score){
            return 1;
        }
        return player1.name.compareTo(player2.name);

    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

