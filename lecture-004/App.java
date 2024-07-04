// import java.beans.Statement;
// import java.lang.classfile.attribute.LineNumberTableAttribute;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");

        // 1. Simple If Statement: It is the most basic statement among all control flow
        // statements in Java. It evaluates a Boolean expression and enables the program
        // to enter a block of code if the expression evaluates to true.

        // int x = 10;
        // int y = 12;

        // if (x + y < 20) {
        // System.out.println("x+y is greater than 20");
        // }

        // 2) if-else statement

        // The if-else statement is an extension to the if-statement, which uses another
        // block of code, i.e., else block. The else block is executed if the condition
        // of the if-block is evaluated as false.

        // int x = 10;
        // int y = 12;
        // if (x + y < 10) {
        // System.out.println("x + y is less than 10");
        // } else {
        // System.out.println("x + y is greater than 20");
        // }

        // 3) if-else-if ladder:
        // The if-else-if statement contains the if-statement followed by multiple
        // else-if statements. In other words, we can say that it is the chain of
        // if-else statements that create a decision tree where the program may enter in
        // the block of code where the condition is true. We can also define an else
        // statement at the end of the chain.

        // String city = "Noida";

        // if (city == "Meerut") {
        // System.out.println("city is meerut");
        // }
        // else if (city == "Noida") {
        // System.out.println("city is noida");
        // }
        // else if (city == "Agra") {
        // System.out.println("city is agra");
        // }
        // else {
        // System.out.println(city);
        // }

        // 4. Nested if-statement

        // In nested if-statements, the if statement can contain a if or if-else
        // statement inside another if or else-if statement.

        // if(condition 1)
        // {
        // statement 1; //executes when condition 1 is true

        // if(condition 2) {
        // statement 2; //executes when condition 2 is true
        // }
        // else{
        // statement 2; //executes when condition 2 is false
        // }
        // }

        // Switch Statement:

        // int num = 1;

        // switch (num) {
        // case 0:
        // System.out.println("number is 0");
        // break;
        // case 1:
        // System.out.println("number is 1");
        // break;
        // default:
        // System.out.println(num);
        // }

        // The case variables can be int, short, byte, char, or enumeration. String type
        // is also supported since version 7 of Java

        // Cases cannot be duplicate

        // Default statement is executed when any of the case doesn't match the value of
        // expression. It is optional.

        // Break statement terminates the switch block when the condition is satisfied.

        // It is optional, if not used, next case is executed.

        // While using switch statements, we must notice that the case expression will
        // be of the same type as the variable. However, it will also be a constant
        // value.

        // Loop in Java

        // 1.for loop:

        // In Java, for loop is similar to C and C++. It enables us to initialize the
        // loop variable, check the condition, and increment/decrement in a single line
        // of code. We use the for loop only when we exactly know the number of times,
        // we want to execute the block of code.

        // for (int j = 1; j <= 10; j++) {
        // System.out.println(j);
        // }

        // 2. for-each loop

        // Java provides an enhanced for loop to traverse the data structures like array
        // or collection. In the for-each loop, we don't need to update the loop
        // variable.

        // String[] names = { "Java", "C", "C++", "Python", "JavaScript" };

        // System.out.println("Printing the content of the array names:\n");
        // for (String name : names) {
        // if(name == "C"){
        // break;
        // }
        // System.out.println(name);

        // }

        // 3. while loop

        // The while loop is also used to iterate over the number of statements multiple
        // times. However, if we don't know the number of iterations in advance, it is
        // recommended to use a while loop.

        // int i = 0;
        // System.out.println("Printing the list of first 10 even numbers \n");
        // while (i <= 10) {
        // System.out.println(i);
        // i = i + 2;
        // }

        // 4. do-while loop

        // The do-while loop checks the condition at the end of the loop after executing
        // the loop statements. When the number of iteration is not known and we have to
        // execute the loop at least once, we can use do-while loop.

        // int i = 3;
        // System.out.println("Printing the list of first 10 even numbers \n");
        // do {
        // System.out.println(i);
        // i = i + 2;
        // } while (i % 2 == 0);

        // for(int i = 0;i<=10;i++){
        // if(i%2 == 0){
        // break;
        // }
        // System.out.println(i);

        // }
        // for(int i = 0;i<=10;i++){
        // if(i%2 == 0){
        // continue;
        // }
        // System.out.println(i);

        // }

        // System.out.println("Your loop is terminated");

        // Arrays

        // int a[] = { 33, 3, 4, 5 };// declaration, instantiation and initialization
        // // printing array
        // System.out.println(a.length);
        // // for (int i = 0; i < a.length; i++)// length is the property of array
        // //     System.out.println(a[i]);


        // String

        // by Literal

        // String s1 = "Welcome";  
        // String s2 = "Welcome";//It doesn't create a new instance  
        // System.out.println(s2);

        // by new keyword

        // String s = new String("krishna");
        // System.out.println(s);





    }
}
