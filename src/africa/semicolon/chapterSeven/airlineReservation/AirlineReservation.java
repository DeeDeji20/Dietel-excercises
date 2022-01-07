package africa.semicolon.chapterSeven.airlineReservation;

import java.util.Scanner;

public class AirlineReservation {
    public static void main(String[] args) {
        boolean[] seatIsEmpty = new boolean[10];
        for (int i = 0; i < 10; i++) {
            int classForReservation = collectUserInput("Please type 1 for First Class and\n" +
                    "Please type 2 for Economy");
            int seatNumber = 0;
            try {
                seatNumber = assignSeatNumbers(classForReservation);
            }catch(IllegalArgumentException e){
                System.out.println("Invalid Input");
//                collectUserInput();
            }
            seatIsReserved(seatNumber, seatIsEmpty, classForReservation);
        }
        displaySeats(seatIsEmpty);

    }

    private static void displaySeats(boolean[] seatIsEmpty) {
        for (boolean seats : seatIsEmpty) {
            System.out.println(seats);
        }
    }

    private static void seatIsReserved(int seatNumber, boolean[] seatIsEmpty, int classForReservation) {
//        for (int i = 0; i < seatIsEmpty.length; i++) {
//            if (seatNumber == i+1 && !seatIsEmpty[i]) seatIsEmpty[i] = true;
//            else {
//                collectUserInput("Seat gtaken, Please type 1 for First Class and\n" +
//                        "Please type 2 for Economy");
//            }
//        }
        while (seatIsEmpty[seatNumber]){
//            if (seatIsEmpty[seatNumber]){
//                System.out.println("Seat tken");
//                break;
//            }

            if (seatIsEmpty[0] && seatIsEmpty[1] && seatIsEmpty[2] && seatIsEmpty[3]&& seatIsEmpty[4]){
                System.out.println("All first class seats are taken");
            }
            System.out.println("seat taken");
            assignSeatNumbers(classForReservation);
        }
       if(!seatIsEmpty[seatNumber]) seatIsEmpty[seatNumber-1] = true;
    }

    private static int assignSeatNumbers(int classForReservation) {
        if (classForReservation == 1){
            int num1=(int) (1 + Math.random()* 5);
            System.out.println(num1);
            return num1;
        }
        else if (classForReservation == 2){
            int num2 =(int) (6 + Math.random()* 5);
            System.out.println(num2);
            return num2;
        }
        else throw new IllegalArgumentException();
    }

    public static int collectUserInput(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextInt();
    }
}
