public class Challenge1 {
    public static void main(String[] args) {
    int playerPosition = calculateHighScorePosistion(500);
    displayHighScorePosition("Tim", playerPosition);

    }




    public static int calculateHighScorePosistion(int playerScore) {
        int number = 0;
        if (playerScore >= 1000) {
            number = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            number = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            number = 3;
        } else {
            number = 4;
        }
    return number;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed tp get into position " + playerPosition + " on high score list");
    }


}
