package africa.semicolon.exceptionHandling;

public class ExceptionClass {
    public static void main(String[] args) {
        try{
            int[] arr = new int[4];
            int i = arr[4];
            System.out.println(i);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            int data = 100/0;
        }catch(ArithmeticException e){
            System.out.println("rest of the code");
        }
    }
}
