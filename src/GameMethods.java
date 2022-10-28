import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GameMethods {
    protected String[][] gameArray = new String[4][4];

    //Lista för dubbletter
    List<Integer> numberList = new ArrayList<>();

    //Genererar nytt nummer för varje ruta
    public void NewGame(){
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                gameArray[i][j] = String.valueOf(randomNum());
            }
        }
    }

    //Return true om numret finns
    protected boolean numberExists(List<Integer> inputList,int input){
        boolean result = false;
        for (int i = 0; i < inputList.size(); i++) {
            if(inputList.get(i) == input){
                result = true;
                break;
            }
        }
        return result;
    }

    //Hämtar nytt random nummer mella 1-15
    protected String randomNum(){
        while (true){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 17);
            if(!numberExists(numberList, randomNum)){
                numberList.add(randomNum);
                return randomNum != 16 ? String.valueOf(randomNum) : " ";
            }
        }
    }

    public void testGame(){
        NewGame();
        System.out.println(gameArray[0][0] + " " + gameArray[0][1] + " " +gameArray[0][2] + " " + gameArray[0][3]);
        System.out.println(gameArray[1][0] + " " + gameArray[1][1] + " " +gameArray[1][2] + " " + gameArray[1][3]);
        System.out.println(gameArray[2][0] + " " + gameArray[2][1] + " " +gameArray[2][2] + " " + gameArray[2][3]);
        System.out.println(gameArray[3][0] + " " + gameArray[3][1] + " " +gameArray[3][2] + " " + gameArray[3][3]);
    }

    public void MoveBox(){



    }

    protected boolean IsValidMove(){

    }

    protected boolean CheckIfWon(){

    }
}
