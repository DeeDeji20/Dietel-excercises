package africa.semicolon.chapterSeven.airlineReservation;

import java.util.Scanner;

public class AirlineReservation {
    private static final Scanner scan = new Scanner(System.in);

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
        while (seatIsEmpty[seatNumber]){
            if (seatIsEmpty[0] && seatIsEmpty[1] && seatIsEmpty[2] && seatIsEmpty[3]&& seatIsEmpty[4]){
                System.out.println("All first class seats are taken\nwould you like a reservation at economy class?");
                String response = scan.nextLine();
                if (response.toUpperCase().charAt(0) == 'Y')
                break;
            }else if(seatIsEmpty[5] && seatIsEmpty[6] && seatIsEmpty[7] && seatIsEmpty[8] && seatIsEmpty[9]){
                System.out.println("All economy class seats are taken\nwould you like a reservation at first class?");
                break;
            }else{
                System.out.println("Seat taken");
                seatNumber = assignSeatNumbers(classForReservation);
            }
//            break;
        }
        if(!seatIsEmpty[seatNumber]) seatIsEmpty[seatNumber] = true;
    }

    private static int assignSeatNumbers(int classForReservation) {
        if (classForReservation == 1){
            int num1=(int) (0 + Math.random()* 5);
            System.out.println(num1);
            return num1;
        }
        else if (classForReservation == 2){
            int num2 =(int) (5 + Math.random()* 4);
            System.out.println(num2);
            return num2;
        }
        else throw new IllegalArgumentException();
    }

    public static int collectUserInput(String message) {
        System.out.println(message);
        return scan.nextInt();
    }
}
