package africa.semicolon.chapterThree.healthProfile;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile person1=new HealthProfile("Adeola", "Oladeji", "female",15, 9, 1949, 1.6, 50.0);

        System.out.println(person1.getBodyMassIndex());
    }
}
