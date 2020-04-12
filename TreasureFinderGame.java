
package treasure.finder.game;

import java.util.Random;
import java.util.Scanner;

public class TreasureFinderGame {

    public static void display(String board[], String board2[], String board3[], String board4[], String start[], String name) {
        System.out.println("\t\t*Welcome to Treasure Finder Game*");
        System.out.println("\t\t  " + name + " ! We glad you are here!\n\n");
        
        System.out.println("        -----------------        ");
        System.out.println("        |   " + start[1] +  "    |             ");
        System.out.println("|^^^^^^^|^^^^^^^|^^^^^^^|^^^^^^^|") ;
        System.out.println("|   " + board4[1] + "   |   " + board4[2] + "   |   " + board4[3] + "   |   " + board4[4] + "   |") ; ;
        System.out.println("|^^^^^^^|^^^^^^^|^^^^^^^|^^^^^^^|") ;
        System.out.println("|   " + board3[1] + "   |   " + board3[2] + "   |   " + board3[3] + "   |   " + board3[4] + "   |") ;
        System.out.println("|^^^^^^^|^^^^^^^|^^^^^^^|^^^^^^^|") ;
        System.out.println("|   " + board2[1] + "   |   " + board2[2] + "   |   " + board2[3] + "   |   " + board2[4] + "   |") ;
        System.out.println("|^^^^^^^|^^^^^^^|^^^^^^^|^^^^^^^|") ;
        System.out.println("|   " + board[1] + "   |   " + board[2] + "   |   " + board[3] + "   |   " + board[4] + "   |") ;
        System.out.println("---------------------------------") ;
        System.out.println("             |  " + start[0] + "  |             ");
        System.out.println("             -------             ");
    }

    public static void main(String[] args) {
    
        Random rand = new Random() ;
        Scanner input = new Scanner(System.in) ;
        String[] board = new String [5] ;
        String[] board2 = new String [5] ;
        String[] board3 = new String [5] ;
        String[] board4 = new String [5] ;
        String[] start = new String [2] ;
        for(int i = 0; i < 5 ; i++){
            board[i] = " ";
        }
        for(int i = 0; i < 5 ; i++){
            board2[i] = " ";
        }
        for(int i = 0; i < 5 ; i++){
            board3[i] = " ";
        }
        for(int i = 0; i < 5 ; i++){
            board4[i] = " ";
        }
        start[0] = "@" ;
        start[1] = "Treasure" ;
        String name;
        System.out.println("Enter Your name please : ");
        name = input.next() ;
        display(board, board2, board3, board4, start, name) ;
        int rand1 = 0, rand2 = 0, rand3 = 0, rand4 = 0, finder ;
        rand1 = rand.nextInt(4) + 1;
        rand2 = rand.nextInt(4) + 1;
        rand3 = rand.nextInt(4) + 1;
        rand4 = rand.nextInt(4) + 1;
        System.out.println(rand1 + " " + rand2 + " " + rand3 + " " + rand4 );
        System.out.println("Please Enter the number to step forward : ");
        finder = input.nextInt() ;
        while( finder <= 0 || finder > 4 ){
            System.out.println("Invalid input ! Please Enter the correct one...");
            finder = input.nextInt() ;
        }
        if(rand1 == finder){
            for(int J = 0 ; J < 5 ; J++){
                if( rand1 == J){
                    board[J] = start[0] ;
                }
            }
            start[0] = " " ;
            display(board, board2, board3, board4, start, name) ;
        }
        System.out.println("Please Enter the number to step forward : ");
        finder = input.nextInt() ;
        while( finder <= 0 || finder > 4 ){
            System.out.println("Invalid input ! Please Enter the correct one...");
            finder = input.nextInt() ;
        }
        if(rand2 == finder){
            for(int J = 0 ; J < 5 ; J++){
                if( rand2 == J){
                    board2[J] = board[rand1] ;
                }
            }
            board[rand1] = " " ; 
            display(board, board2, board3, board4, start, name) ;
        System.out.println("Please Enter the number to step forward : ");
        finder = input.nextInt() ;
        while( finder <= 0 || finder > 4 ){
            System.out.println("Invalid input ! Please Enter the correct one...");
            finder = input.nextInt() ;
        }
        if(rand3 == finder){
            for(int J = 0 ; J < 5 ; J++){
                if( rand3 == J){
                    board3[J] = board2[rand2] ;
                }
            }
            board2[rand2] = " " ;
            display(board, board2, board3, board4, start, name) ;
        }
        System.out.println("Please Enter the number to step forward : ");
        finder = input.nextInt() ;
        while( finder <= 0 || finder > 4 ){
            System.out.println("Invalid input ! Please Enter the correct one...");
            finder = input.nextInt() ;
        }
        if(rand4 == finder){
            for(int J = 0 ; J < 5 ; J++){
                if( rand4 == J){
                    board4[J] = board3[rand3] ;
                }
            }
            board3[rand3] = " " ;
            display(board, board2, board3, board4, start, name) ;
        }
        System.out.println("Congrajulations ! You have won the creadit ! ");

        }
    }
}