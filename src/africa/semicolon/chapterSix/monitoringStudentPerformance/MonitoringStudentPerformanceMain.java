package africa.semicolon.chapterSix.monitoringStudentPerformance;

import africa.semicolon.chapterSix.reducingFatigue.ComputerAssitedInstructionToReduceFatigue;

public class MonitoringStudentPerformanceMain {
    public static void main(String[] args) {
        MonitoringStudentPerformance monitoringStudentPerformance = new MonitoringStudentPerformance();
        for (int i = 0; i < 3; i++) {
            monitoringStudentPerformance.startGame();
        }
        monitoringStudentPerformance.displayAverage();

    }
}
