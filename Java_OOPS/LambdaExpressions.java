import java.util.function.BinaryOperator;
import java.util.Arrays;

interface FunctionalInterface{
    int sum(int a,int b);
}

class Main {
    public int add(int a,int b){
        FunctionalInterface f=(int x,int y)-> x+y;
        return f.sum(a, b);
    }
}

public class LambdaExpressions {
    public static void print(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        //creating a lambda expression
       
        BinaryOperator<Integer> add=(a,b)->a+b;
        System.out.println(add.apply(10,30));

        Main m=new Main();
        System.out.println(m.add(10, 30));

        int []id={1,2,3,4};
        Arrays.stream(id).forEach(LambdaExpressions::print);
    }
}
