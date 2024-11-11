package Java_OOPS;

/*
 * Access modifiers are 4 types.
 * ////////////////////////////////////
 * public : public access throughout the package any class can access it by using the object of the class.
 *  ---------------------------------------------------------------------------------
 * private : only the class methods can access the private members and methods. 
    In order to access them outside the class we use setter and getter methods. 
 * ---------------------------------------------------------------------------------
 * protected : the members of it's class and inherited class can access them.
 * ---------------------------------------------------------------------------------
 *  default : It is similar to public but only difference is it behaves like 
    public in that package only. If you try to access this outside the package it throws an error.
 */

// If a class is not declared public by default it package - private means only accessible in this package.
class PublicClass{
    //once a variable is declared public then it can be accessible using class object every where.
    public int a=10;
    public PublicClass(){
        System.out.println("this is public class in java and the public variable is "+a);
    }

    private int b=20;
    //once a method or variable is private we cannot access it outside the class. So, we use getter and 
    //setter methods to assign and retrieve members  which are private.
    public int getB(){
        return b;//here as getB() is public we can access it outside the class.
    }

    protected int c=30;
    //only super class and inherited class access the members of the class.
}





public class AccessModifiersminiconcept extends PublicClass{
    public static void main(String args[]){
            PublicClass p=new PublicClass(); //as we created object of public class now we have access to all it's public methods.
            System.out.println(p.getB());
            System.out.println(p.c);   
    }
}
