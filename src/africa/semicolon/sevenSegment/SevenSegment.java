package africa.semicolon.sevenSegment;

public class SevenSegment {
    private int[][] segments= {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};

    public int[][] getSegment() {
        return segments;
    }

    public void setSegmentA(String userInput) {
            if (userInput.charAt(0)=='1') {
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < segments[i].length; j++) {
                        segments[i][j] =1;
                    }
                }
            }
    }

    public void setSegmentB(String userInput) {
        if (userInput.charAt(1)=='1') {
            for (int i = 3; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    segments[j][i] = 1;
                }
            }
        }
    }

    public void setSegmentC(String userInput) {
        if (userInput.charAt(2) == '1'){
            for (int i = 3; i < 4; i++) {
                for (int j = 2; j < 5; j++) {
                    segments[j][i] = 1;
                }
            }
        }
    }

    public void setSegmentD(String userInput) {
        if (userInput.charAt(3) == '1') {
            for (int i = 4; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    segments[i][j] =1;
                }
            }
        }
    }

    public void setSegmentE(String userInput) {
        if (userInput.charAt(4) == '1'){
            for (int i = 0; i < 1; i++) {
                for (int j = 2; j < 5; j++) {
                    segments[j][i] = 1;
                }
            }
        }
    }

    public void setSegmentF(String userInput) {
        if (userInput.charAt(5) == '1'){
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 3; j++) {
                    segments[j][i] = 1;
                }
            }
        }
    }

    public void setSegmentG(String userInput) {
        if (userInput.charAt(6) == '1'){
            for (int i = 0; i < 4; i++) {
                for (int j = 2; j < 3; j++) {
                    segments[j][i] = 1;
                }
            }
        }
    }
}
