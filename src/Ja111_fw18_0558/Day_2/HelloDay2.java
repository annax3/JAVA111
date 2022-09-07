package Ja111_fw18_0558.Day_2;

public class HelloDay2 {
    public static  void main(String[] args){
        System.out.println("Hello");
        multiplication();
        System.out.println("back to main");
    }
    static void multiplication(){
        System.out.println("Inside the multiplication method");
        int a=10;
        int b=200;
        System.out.println(a*b);
    }
}
