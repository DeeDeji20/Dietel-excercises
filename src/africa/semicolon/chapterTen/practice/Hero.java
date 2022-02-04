package africa.semicolon.chapterTen.practice;

public class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb{
    @Override
    public void fly() {
        System.out.println("Flyiing");
    }

    @Override
    public void swim() {

    }

    @Override
    public void climb() {

    }
}
