class ParentClass{
    
    public int getData(int a){
        return a;
    }

}

class ChildClass extends ParentClass{
    public ChildClass(){
        System.out.println("Child class");
    }
    @Override
    public int getData(int a) throws ArithmeticException{
        throw new ArithmeticException("Number is not valid");
    }
}


public class ExceptionHandlingWithMethodOverriding{
   public static void main(String[] args) {
    try{
        ChildClass c=new ChildClass();
        c.getData(25);
    }
    catch(ArithmeticException e){
        e.printStackTrace();
    }
    
   }
    
}