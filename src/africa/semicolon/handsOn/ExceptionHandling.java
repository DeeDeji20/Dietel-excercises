package africa.semicolon.handsOn;

public class ExceptionHandling {
    public static void main(String[] args) {
//        try{
//            int data = 100/0;
//            System.out.println(data);
//        }catch (ArithmeticException e){
//            System.out.println("rest of the code");
//        }

//        try{
//            String data = null;
//            System.out.println(data.length());
//        }catch (NullPointerException e){
//            System.out.println("rest of the code");
//        }

        try{
            String data = "abc";
            int i = Integer.parseInt(data);
        }catch (NumberFormatException e){
            System.out.println("rest of the code");
        }
    }
}
