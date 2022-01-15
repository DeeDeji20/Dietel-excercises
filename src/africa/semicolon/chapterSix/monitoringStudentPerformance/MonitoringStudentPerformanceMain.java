package africa.semicolon.chapterSix.monitoringStudentPerformance;

import africa.semicolon.chapterSix.reducingFatigue.ComputerAssitedInstructionToReduceFatigue;

public class MonitoringStudentPerformanceMain {
    public static void main(String[] args) {
        MonitoringStudentPerformance monitoringStudentPerformance = new MonitoringStudentPerformance();
        do {
            for (int i = 0; i < 10; i++) {
                monitoringStudentPerformance.startGame();
            }
            monitoringStudentPerformance.displayAverage();
        }while (true);
    }

}
