package africa.semicolon.chapterTen.practice;

public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwim y){
        y.swim();
    }
    public static void v(CanFly z){
        z.fly();
    }
    public  static void x(CanClimb s){
        s.climb();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        v(hero);
        x(hero);
    }
}
