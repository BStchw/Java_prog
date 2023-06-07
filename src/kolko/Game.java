package kolko;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Game {
    char [][] board;

    Game() {
        this.board = new char[4][4];

        board[0][0] = '0';
        board[0][1] = '1';
        board[0][2] = '2';
        board[0][3] = '3';

        board[0][0] = '0';
        board[1][0] = '1';
        board[2][0] = '2';
        board[3][0] = '3';
    }
    public boolean checkIfWon() {
        boolean won = false;
        if(board[1][1] == 'O' || board[1][1] == 'X') {
            if (board[1][1] == board[2][2] && board[1][1] == board[3][3]) {
                won = true;
            }
            if(board[1][1] == board[1][2] && board[1][1] == board[1][3])  {
                won = true;
            }
            if(board[1][1] == board[2][1] && board[1][1] == board[3][1])  {
                won = true;
            }
        }
        if(board[2][1] == 'O' || board[2][1] == 'X') {
            if (board[2][1] == board[2][2] && board[2][1] == board[2][3]) {
                won = true;
            }
        }
        if(board[3][1] == 'O' || board[3][1] == 'X') {
            if (board[3][1] == board[3][2] && board[3][1] == board[3][3]) {
                won = true;
            }
        }
        if(board[1][2] == 'O' || board[1][2] == 'X') {
            if (board[1][2] == board[2][2] && board[1][2] == board[3][2]) {
                won = true;
            }
        }
        if(board[1][3] == 'O' || board[1][3] == 'X') {
            if (board[1][3] == board[2][3] && board[1][3] == board[3][3]) {
                won = true;
            }
        }
        return won;
    }
    public void moveO() {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj współrzędną x.");
            int x = scanner.nextInt();

            System.out.println("Podaj współrzędną y.");
            int y = scanner.nextInt();

            if(x>0 && y>0 && x<4 && y<4) {

                if (board[x][y] == '\u0000') {
                    board[x][y] = 'O';
                    break;
                } else {
                    System.out.println("To pole jest już zajęte!");
                }
            }
            else {
                System.out.println("Współrzędne muszą być liczbami naturalnymi z przedziału od 1 do 3");
            }
        }
    }
    public void moveX() {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj współrzędną x.");
            int x = scanner.nextInt();
            System.out.println(x);

            System.out.println("Podaj współrzędną y.");
            int y = scanner.nextInt();

            if(x>0 && y>0 && x<4 && y<4) {

                if (board[x][y] == '\u0000') {
                    board[x][y] = 'X';
                    break;
                } else {
                    System.out.println("To pole jest już zajęte!");
                }
            }
            else {
                System.out.println("Współrzędne muszą być liczbami naturalnymi z przedziału od 1 do 3");
            }
        }
    }

    public void display()   {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void play()  {
        while(true) {
            System.out.println("Gracz O");
            display();
            moveO();
            if(checkIfWon() == true)    {
                System.out.println("Gracz O wygrał!");
                break;
            }

            display();

            System.out.println("Gracz X");
            display();
            moveX();
            if(checkIfWon() == true)    {
                System.out.println("Gracz X wygrał!");
                break;
            }
        }
    }

}
