import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GameMethods {
    protected int[][] gameArray = new int[4][4];
    protected int[][] winArray = new int[4][4];

    //Lista för dubbletter
    List<Integer> numberList = new ArrayList<>();
    protected int emptyBoxX;
    protected int emptyBoxY;


    public int[][] TestGame(){
        winArray[0][0] = 1;
        winArray[0][1] = 2;
        winArray[0][2] = 3;
        winArray[0][3] = 4;
        winArray[1][0] = 5;
        winArray[1][1] = 6;
        winArray[1][2] = 7;
        winArray[1][3] = 8;
        winArray[2][0] = 9;
        winArray[2][1] = 10;
        winArray[2][2] = 11;
        winArray[2][3] = 12;
        winArray[3][0] = 13;
        winArray[3][1] = 14;
        winArray[3][2] = 0;
        winArray[3][3] = 15;
        emptyBoxX = 3;
        emptyBoxY = 2;
        return winArray;
    }

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

    public void testGame(int[][] input) {
        System.out.println(input[0][0] + " " + input[0][1] + " " + input[0][2] + " " + input[0][3]);
        System.out.println(input[1][0] + " " + input[1][1] + " " + input[1][2] + " " + input[1][3]);
        System.out.println(input[2][0] + " " + input[2][1] + " " + input[2][2] + " " + input[2][3]);
        System.out.println(input[3][0] + " " + input[3][1] + " " + input[3][2] + " " + input[3][3]);
        System.out.println();
    }

    public void MoveBox(int x, int y, int[][] inputArray) {
        int boxValue = inputArray[x][y];
        inputArray[emptyBoxX][emptyBoxY] = boxValue;
        emptyBoxX = x;
        emptyBoxY = y;
        inputArray[x][y] = 0;
        CheckIfWon(inputArray);
        testGame(inputArray);
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

    protected boolean CheckIfWon(int[][] inputArray) {
        boolean won = true;
        int[][] winArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (inputArray[i][j] != winArray[i][j]) {
                    won = false;
                    break;
                }
            }
        }
        return won;
    }
}
