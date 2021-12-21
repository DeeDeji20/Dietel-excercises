package africa.semicolon.handsOn.deeperLookIntoClasses.enumTypes;

public enum Book {
    //declare constants
    JHTP("Java How to Program","2015"),
    CHTP("C how to Program", "2012"),
    IW3HTP("ow to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    //instance variables
    private final String title;
    private final String copyrightYear;

    //enum constructor
    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
