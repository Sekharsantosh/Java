package Java_OOPS;
//we cannot instantiate an abstract method in java.
abstract class Calculator{
    abstract int add(int a,int b);//abstract methods.
    abstract int divide(int a,int b);//abstract methods.

    //concrete methods.
    void  getResult(){
        System.out.println("I am a concrete method."); 
    }
}

class Arithmetic extends Calculator{
    int add(int a,int b){
        return a+b;
    }
    int divide(int a,int b){
        return a/b;
    }
}

public class AbstractClass {
    public static void main(String args[]){
        Arithmetic a=new Arithmetic();

        System.out.println(a.add(25,39));

        System.out.println(a.divide(25,5));

        a.getResult();

    }
}
