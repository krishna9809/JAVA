// User -Defined Exception 

// Step-1 
class InvalidAge extends Exception{
    public InvalidAge(String message){
        super(message);
    }
}


public class UserDefinedException {
    public static void main(String[] args) {
        int age = 19;

        // step 3 
        try{

        checkAge(age);
        }

        catch(InvalidAge e){
            System.out.println(e.getMessage());
        }



    }

    // step 2 

    public static void checkAge(int age) throws InvalidAge{
        if(age < 18){
            throw new InvalidAge("Your age is Invalid");
        }

        System.out.println("Your age is Valid");
    }
}