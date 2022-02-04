package useageOfInterface;

import africa.semicolon.chapterTen.interfaces.Dancebles;

public class Useage implements Dancebles {
    @Override
    public void move() {
        System.out.println("I am moving");
    }

    @Override
    public void shake() {
        System.out.println("I am shaking");
    }

    @Override
    public void sleep() {
        System.out.println("I love sleep");
    }
}
