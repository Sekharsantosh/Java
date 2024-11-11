package Java_OOPS;

class GrandParent{
    public  GrandParent(){
        System.out.println("They are the oldest in the family");
    }
    final void getAge1(){
        System.out.println("Their Age would from 50-100 years.");
    }
}
//we cannot override a method that is declared final.
//final can be used with classes, methods and variables.


class parent extends GrandParent{
    parent(){
        System.out.println("They are the Descendants of the GrandParents");
    }
    
    void getAge(){
        System.out.println("Their Age ranges from 20-40");
    }
}
final class Children extends parent{//we cannot extend this class as it is final.
    Children(){
        System.out.println("They are the Youngest in the family");
    }
    @Override
    void getAge(){
        System.out.println("Their ages ranges from 1 - 19 years.");
    }
}
class children2 extends parent{
    children2(){
        System.out.println("I am the Second born in the family. with same characteristics of my parents.");

    }
    void getAge(){
        System.out.println("My age is between 1-20 years.");
    }
}


public class Inheritance {
    public static void main(String args[]){
        parent p=new Children();
        p.getAge();
       
        p=new parent();
        p.getAge();


        p=new children2();
        p.getAge();

        Children c=new Children();
        c.getAge();
        //Since child class is final so it either cannot be extended nor it can reference to its parents.
        //c=new parent();
        //c.getAge();

        GrandParent gp=new parent();

        gp.getAge1();

        gp=new GrandParent();

        gp.getAge1();
        

    }
}
