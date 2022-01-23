package africa.semicolon.chapterEight.taxClass;

public enum Status {
    SINGLE_FILTER(0),
    MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(1),
    MARRIED_SEPERATELY(2),
    HEAD_OF_HOUSEHOLD(3);

    private final int status;

    Status(int status) {
        this.status = status;
    }
}
