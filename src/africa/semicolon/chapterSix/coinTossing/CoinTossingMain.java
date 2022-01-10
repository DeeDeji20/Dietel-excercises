package africa.semicolon.chapterSix.coinTossing;


public class CoinTossingMain {
    public static void main(String[] args) {
        CoinTossing coinTossing = new CoinTossing();
        String message ="""
                press 1 to toss coin
                press 2 to exit
                """;

        int input = coinTossing.promptUser(message);
        if (input ==1 ) {
            while (input == 1) {
                int side = coinTossing.tossCoin();
                Status headOrtail = coinTossing.checkSides(side);
                System.out.println(headOrtail);
                input = coinTossing.promptUser(message);

            }
        }
        else System.exit(0);

        
        System.out.printf("The total head count is : %d%n", coinTossing.getHeadCount());
        System.out.printf("The total tail count is : %d", coinTossing.getTailCount());


    }
}
