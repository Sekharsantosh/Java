package Java_OOPS;


class Parent{
    public int a;
    //this key word will refer to particular instance of the class.
    //it will be used when argument and class variable have same.
    // it is used when parent and child have same method name but you want to access child class member.
    public Parent(int a){
        this.a=a;
    }
}

class Child extends Parent{
    public int a=30;
    public Child(){
        /*The super constructor call must be the first statement in the constructor 
        of the child class, not in a regular method.
         */
        super(45);
        System.out.println(a);//super is used to access parent members in child class.
    }
    public void getParent(int a){
        System.out.println(super.a+a);
    }
}



public class SuperandThis {
    public static void main(String args[]){
        Child c=new Child();
        c.getParent(45);
    }  
}
