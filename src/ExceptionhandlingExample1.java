public class ExceptionhandlingExample1 {

    public static void main(String[] args){
        try {
            int a = 100 / 1;
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println("please close the database connection");
        }
    }
}
