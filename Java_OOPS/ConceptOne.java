package Java_OOPS;

//Classes and objects

//declaration
class Main{

    //constructors
    //default constructor in java
    public Main(){
        System.out.println("Welcome to OOPS tutorials.");
    }

    //Parameterized constructor
    public Main(String name){
        System.out.println("welcome "+name);
    }

    //copy constructor
    //use it only when there are previously available objects

    public Main(Main m){
        this.variable1=m.variable1;
        System.out.println(this.variable1);
    }


    //methods and variables.
    int variable1;
    public void assignValue(int a){
        variable1=a;
    }
    public void getValue(){
        System.out.println(variable1);
    }

    //method overloading or compile time polymorphism.
    //in method overloading no of arguments, type of arguments, return type may differ but name of the method will be same
    int sum(int a ,int b){
        return a+b;
    }
    
    
    int sum(int a,int b,int c){
        return a+b+c;

    }

}



class Subclass extends Main{
   public Subclass(){
     super();//super is a key word that invokes parent of the child class.
     System.out.println("welcome to Inheritance in java");
   }

/*

* method overriding or runtime polymorphism.
* in method overriding the method in parent class is overwritten by child class the compiler will identify which method to invoke during runtime.
* in method overriding the accessibility of overridden and over ridding method should be same.

*/

   @Override
   public int sum(int a,int b){ 
    return a*b;
   }
}

public class ConceptOne {
    public static void main(String args[]){
       //Instantiating an object.
       Main Object=new Main();
       Object.assignValue(10);
       Object.getValue();
       Object=new Subclass();

       Main t=new Subclass();
       System.out.println(t.sum(2,5,5));

       System.out.println(t.sum(2,5));//here when we invoke t.sum(a,b) the overridden methods is getting invoked.

    }
}
