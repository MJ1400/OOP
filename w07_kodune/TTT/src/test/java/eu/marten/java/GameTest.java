package eu.marten.java;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for Tic-Tac-Toe.
 */
public class GameTest {

    static char symbol;
    static char[][] board;
    static GameFunctions gf = new GameFunctions();

    @BeforeClass
    public static void initiateGame() {
    gf.createGame();
    } 

    
    @Test
    public void getSymbolTest() {
        assertTrue("getSymbol returns x", gf.getSymbol() == 'x');
    }


    //Ei kasuta siin loodud boardi, ehk returnib false kuigi board on fullis
    @Test
    public void isBoardFullTest1() {
    board = new char[3][3];
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 'x';
            }
        }
        assertTrue("board is full", gf.isBoardFull() == true);

    }
    // @Test
    // public void createBoardTest() {
    // char[][] testBoard;
    // testBoard = new char[3][3];
    // for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
    //             testBoard[i][j] = '-';
    //         }
    //     }
    // assertArrayEquals("createBoard creates board", testBoard, board);

    // }
}
