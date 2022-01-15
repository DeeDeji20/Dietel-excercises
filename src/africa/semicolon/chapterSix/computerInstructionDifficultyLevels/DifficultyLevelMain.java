package africa.semicolon.chapterSix.computerInstructionDifficultyLevels;

public class DifficultyLevelMain {
    public static void main(String[] args) {
        DifficultyLevel level = new DifficultyLevel();
        int difficultyLevel = level.promptUserForDifficultyLevel("Enter difficulty level: ");
        level.displayQuestionBasedOnDifficultyLevel(difficultyLevel);
    }

}
