package africa.semicolon.chapterNine.livingThings;

import org.junit.jupiter.api.Test;

class LivingThingsTest {
    @Test
    void livingThingsCanBreathe(){
        LivingThings livingThings = new LivingThings("animalia");
        Amphibian amphibian = new Amphibian("froggie");
        amphibian.breathe();
//        livingThings.braethe();
    }
}