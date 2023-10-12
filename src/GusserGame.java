import java.util.Scanner;

class Gusser{
    int gusserNum;

    int gusserNum() {

        Scanner G = new Scanner(System.in);
        System.out.println(" Gusser Guess the no");
        gusserNum=G.nextInt();
        return gusserNum;
    }
}
class Player{
    int gusssNumber;

    int gusssNumber() {
        Scanner P = new Scanner(System.in);
        System.out.println(" Player"+ " Guess the number ");
        gusssNumber =P.nextInt();
        return gusssNumber;


    }
}
class Umpire{
    int getgusserNum;
    int GetPlayer1;
    int GetPlayer2;
    int GetPlayer3;



    void getgusserNum(){
        Gusser Gn = new Gusser();
        getgusserNum = Gn.gusserNum();
    }

    void GetPlayerNum(){
        Player Gp1 = new Player();
        Player Gp2 = new Player();
        Player Gp3 = new Player();
        GetPlayer1 = Gp1.gusssNumber();
        GetPlayer2 = Gp2.gusssNumber();
        GetPlayer3 = Gp3.gusssNumber();


    }

    void compare(){
        if (getgusserNum == GetPlayer1)
        {
            if (getgusserNum ==  GetPlayer2 && getgusserNum ==  GetPlayer3 ) {

                System.out.println( "Hurrey!! all players won ");
            }
            else if(getgusserNum == GetPlayer2 ) {
                System.out.println(" player 1 and player 2 both Win");
            }
            else if (getgusserNum == GetPlayer3 ) {
                System.out.println(" player 1 and player 3 both Win");
            }
            else {
                System.out.println( " player 1 win the game ");
            }
        }
        else if (getgusserNum == GetPlayer2)
        {
            System.out.println( " player 2 win the game ");

        }
        else if (getgusserNum == GetPlayer3 )
        {
            System.out.println( " player 3 win the game ");

        }
        else {
            System.out.println(" Unfortunately ! no winner ...");
        }



    }

}

public class GusserGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(" Start the game !!");
        Umpire U = new Umpire();
        U.getgusserNum();
        U.GetPlayerNum();
        U.compare();

    }

}
