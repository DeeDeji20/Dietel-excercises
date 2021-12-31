package africa.semicolon.chapterFour.tabularOutput;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t   10*N\t   100*N\t1000*N");
        for (int i =1; i<=5; i++){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n", i, 10*i, 100*i,  1000*i);
        }
    }
}
