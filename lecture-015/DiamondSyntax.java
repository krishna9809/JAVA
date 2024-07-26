
abstract class calculator<T>{

    abstract T add(T a, T b);  
}
public class DiamondSyntax {
    
    public static void main(String[] args) {
        
        calculator<Integer> obj1 = new calculator<>() {
            Integer add(Integer a,Integer b){
                return a+b;
            }
        };
        System.out.println(obj1.add(12,23));
    } }





    