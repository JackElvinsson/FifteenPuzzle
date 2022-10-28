import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GameMethods {
    protected int[][] gameArray = new int[4][4];

    //Lista för dubbletter
    List<Integer> numberList = new ArrayList<>();
    protected int emptyBoxX;
    protected int emptyBoxY;

    //Genererar nytt nummer för varje ruta
    public int[][] NewGame() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int temp = randomNum();
                if (temp == 0) {
                    gameArray[i][j] = temp;
                    emptyBoxX = i;
                    System.out.println(emptyBoxX);
                    emptyBoxY = j;
                    System.out.println(emptyBoxY);
                } else gameArray[i][j] = temp;
            }
        }
        return gameArray;
    }

    //Return true om numret finns
    protected boolean numberExists(List<Integer> inputList, int input) {
        boolean result = false;
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) == input) {
                result = true;
                break;
            }
        }
        return result;
    }

    //Hämtar nytt random nummer mella 1-15
    protected int randomNum() {
        if(numberList.size() == 16){
            numberList.clear();
        }
        while (true) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 16);
            if (!numberExists(numberList, randomNum)) {
                numberList.add(randomNum);
                return randomNum;
            }
        }
    }

    public void testGame() {
        System.out.println(gameArray[0][0] + " " + gameArray[0][1] + " " + gameArray[0][2] + " " + gameArray[0][3]);
        System.out.println(gameArray[1][0] + " " + gameArray[1][1] + " " + gameArray[1][2] + " " + gameArray[1][3]);
        System.out.println(gameArray[2][0] + " " + gameArray[2][1] + " " + gameArray[2][2] + " " + gameArray[2][3]);
        System.out.println(gameArray[3][0] + " " + gameArray[3][1] + " " + gameArray[3][2] + " " + gameArray[3][3]);
        System.out.println();
    }

    public void MoveBox(int x, int y) {
        int boxValue = gameArray[x][y];
        gameArray[emptyBoxX][emptyBoxY] = boxValue;
        emptyBoxX = x;
        emptyBoxY = y;
        gameArray[x][y] = 0;
        CheckIfWon();
        testGame();
    }

    public boolean IsValidMove(int x, int y) {
        if (x == emptyBoxX && y + 1 == emptyBoxY) {
            return true;
        } else if (x == emptyBoxX && y - 1 == emptyBoxY) {
            return true;
        } else if (y == emptyBoxY && x + 1 == emptyBoxX) {
            return true;
        } else if (y == emptyBoxY && x - 1 == emptyBoxX) {
            return true;
        } else return false;
    }

    protected boolean CheckIfWon() {
        boolean won = true;
        int[][] winArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (gameArray[i][j] != winArray[i][j]) {
                    won = false;
                    break;
                }
            }
        }
        return won;
    }
}
