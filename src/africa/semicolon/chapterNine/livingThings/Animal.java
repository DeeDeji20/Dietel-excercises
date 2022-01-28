package africa.semicolon.chapterNine.livingThings;

public class Animal extends LivingThings{
    public Animal(String name) {
        super(name);
    }

    public void breathe(){
        System.out.println("I am breathing cos i am a living thing");
    }
}
