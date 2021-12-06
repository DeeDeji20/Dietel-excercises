package africa.semicolon.chapterThree.date;

public class DateTest {
    public static void main(String[] args) {
        Date newDate = new Date(0, 0, 0);

        newDate.setMonth(9);
        newDate.setDay(15);
        newDate.setYear(2005);
        System.out.println(newDate.displayDate());

    }
}
