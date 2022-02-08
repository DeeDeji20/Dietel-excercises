package africa.semicolon.chapterSeven.myersBriggs;

public enum PersonalityTrait {
    INTROVERT("I"),
    EXTROVERT("E"),
    SENSITIVE("S"),
    INTUITIVE("N"),
    JUDGEMENT("J"),
    PERCEPTION("P"),
    THINKERS("T"),
    FEELERS("F");

    private final String value;
    PersonalityTrait(String code){
        value = code;
    }

    public String getValue() {
        return value;
    }
}
