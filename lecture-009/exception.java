// try-catch-finally

public class exception {
    public static void main(String[] args) {
    
    System.out.println("Multi Atoms");

    try{
    System.out.println(10/2);
    } catch(ArithmeticException e){
        System.out.println("Exception Occur");
    } finally{
        System.out.println("Finally Runs");
    }

    System.out.println("Multi Atoms Plus");    


    }
}
