

class animal {
    String name;
    String color;

    public void voice(){
        System.out.println("brake");
    }
}

public class lec4{
 public static void main(String arg[]){
    animal dog = new animal();
    dog.name = "max";
    dog.color = "light";
    System.out.println(dog.name);
    System.out.println(dog.color);
    dog.voice();
 }
}