// throws and throw 


public class SimpleThrowsExample {
    public static void main(String[] args) {

        int a = 10;

        try{
        divide(a);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occur" + e.fillInStackTrace());
        }
    }

    static int divide(int a) throws ArithmeticException{
        return a/0;
    }


  
}