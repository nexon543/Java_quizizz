package exception;

public class RethrowFinally {
    public static void main(String[] args) throws Exception {
        int a = 1;
        try {
            try {
                a = 10;
                throw new Exception("1");
            } catch (Exception ex) {
                a = 20;
                throw new Exception("2");
            } finally {
                a = 30;
                throw new Exception("3");
            }
        } catch (Exception ex) {

            System.out.println("ex is "+ex.getMessage()+" a="+a);
        }
    }
}
