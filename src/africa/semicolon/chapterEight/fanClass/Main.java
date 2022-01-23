package africa.semicolon.chapterEight.fanClass;

public class Main {
    public static void main(String[] args) {
        FanClass fanClass1 = new FanClass(Speed.FAST, true);
        fanClass1.setRadius(10.0);
        fanClass1.setColor("Yellow");
        System.out.println(fanClass1);

        FanClass fanClass2 = new FanClass(Speed.MEDIUM, false);
        fanClass2.setRadius(5.0);
//        fanClass2.setColor("");
        System.out.println(fanClass2);
    }
}
