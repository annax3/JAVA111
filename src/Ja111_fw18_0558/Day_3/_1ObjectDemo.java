package Ja111_fw18_0558.Day_3;

public class _1ObjectDemo {
    public static void main(String[] args){
        //create object of the class A
        //let a= new A();
        //syntax : type var_name = new class()
        A a=new A();
        A a1=new A();
        a.sayHello();
    }
}
class A{
    int variable=10;
    void sayHello(){
        System.out.println("Hello");
    }
    A(){//constructor
        System.out.println("constructor called.");
    }
}
