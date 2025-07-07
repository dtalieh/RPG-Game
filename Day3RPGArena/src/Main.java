import java.util.Random;

public class Main {
    public static Random generator =new Random();
    public static void main(String[] args) {
        //Define Character class objects
        Character player1 = new Character(10,2,100);
    Character player2 = new Rogue();





//Print out 1 v 1 staments
        System.out.println(player1.name + " vs. " + player2.name);
        System.out.println(player1.health + " vs. " + player2.health);

//Check if player1 and player 2are alive
        while(player1.isAlive() && player2.isAlive()){
            System.out.println(player1.name + ": "+ player1.health);
            System.out.println(player2.name + ": "+player2.health);

            int damage;
            damage=player1.attack(player2);
            System.out.println(player1.name + " hits "+player2.name+ " for "+ damage);

            damage=player2.attack(player1);
            System.out.println(player2.name + " hits " +player1.name +" for " +damage);

        }


        if(player1.isAlive()) {
            System.out.println(player1.name + " wins!");
        }
        else if (player2.isAlive()) {
            System.out.println(player2.name + " wins!");
        }
        else{
                System.out.println("Its a draw");
            }

        }
    }
