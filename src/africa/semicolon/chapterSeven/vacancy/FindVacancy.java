package africa.semicolon.chapterSeven.vacancy;

import java.util.Scanner;

public class FindVacancy {
    int[] rooms = {2, 6, 0, 4, 5, 4, 1};
    private int i;

    public void searchForRoom() {
//        int userInput = promptUserForNumberOfPeople();
        boolean isEmpty = checkForEmptyRoom();
        if (isEmpty){
            assignRoom(true);
            printArray();
        } else System.out.println("Sorry no vacancy");

    }

    private void printArray() {
        for (int room : rooms) {
            System.out.print(room + " ");
        }
    }

    private void assignRoom(boolean isEmpty) {
        if (isEmpty){
            int numberOfPeople = promptUserForNumberOfPeople("How many rooms for room "+ i);
            allocatePeople(numberOfPeople);
        }
    }

    private void allocatePeople(int numOfPeople) {
        rooms[i] = numOfPeople;
    }

    private int promptUserForNumberOfPeople(String msg) {
        System.out.println(msg);
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();
    }

    private boolean checkForEmptyRoom() {
        for ( i = 0; i < rooms.length; i++) {
            if (rooms[i] == 0) return true;
        }
        return false;
    }

}
