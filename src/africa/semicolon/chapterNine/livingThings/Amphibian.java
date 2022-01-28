package africa.semicolon.chapterNine.livingThings;

public class Amphibian extends Animal{

    public Amphibian(String name) {
        super(name);
    }

    @Override
    public void breathe(){
        System.out.println("I am an amphibian and i still breathe my own way");
    }
}
