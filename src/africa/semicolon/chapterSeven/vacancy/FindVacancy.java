package africa.semicolon.chapterSeven.vacancy;

import java.util.Scanner;

public class FindVacancy {
    int[] rooms = {2, 6, 8, 0, 5, 4, 0};
    public void searchForRoom() {
        boolean isEmpty = checkForEmptyRoom();
        assignRoom(isEmpty);
    }

    private void assignRoom(boolean isEmpty) {
        if (isEmpty){
            int numberOfPeople = promptUserForNumberOfPeople();
            allocatePeople(numberOfPeople);
        }
    }

    private void allocatePeople(int numOfPeople) {
        for (int i = 0; i < rooms.length; i++) {
            
        }
    }

    private int promptUserForNumberOfPeople() {
        System.out.println("How many users are available");
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();
    }

    private boolean checkForEmptyRoom() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == 0) return true;
        }
        return false;
    }
}
