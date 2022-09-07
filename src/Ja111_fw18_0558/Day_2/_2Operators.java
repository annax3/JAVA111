package Ja111_fw18_0558.Day_2;

public class _2Operators {
    public static void main(String[] args){
        int a=10;
        System.out.println(a);//10
        System.out.println(a++);//10 -> 11
        System.out.println(++a);//12
        System.out.println(a--);//12 -> 11
        System.out.println(--a);//10
        System.out.println(a);//10
        int b=5;
        //(6-7)
        System.out.println(++b - ++b);
        System.out.println(true^true);//Exor
        System.out.println(true^false);
        System.out.println(a<<b);
    }
}
