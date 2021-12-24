import java.util.*;

class Player{

    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}

class Checker implements Comparator<Player>{
/*
    less than = -1
    equal = 0
    greater than = 1
 */

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getScore() == o2.getScore()){
            if(o1.getName().compareTo(o2.getName()) == 0){
                 return 0;
            }else if(o1.getName().compareTo(o2.getName()) > 0){
                 return 1;
            }else{
                 return -1;
            }
        }else if(o1.getScore() < o2.getScore()){
            return 1;
        }else{
            return -1;
        }
    }
}



public class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
