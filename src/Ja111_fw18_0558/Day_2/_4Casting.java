package Ja111_fw18_0558.Day_2;

public class _4Casting {
    public static void main(String[] args){
        //implicit = internal = automatic
        byte myByte = 10;
        int myInt=myByte;

        int i=10;
        byte b = (byte) i;//explicit type casting
        System.out.println(b);
        byte b1=20;
        byte b2=25;
        byte b3=(byte)(b1+b2);
        System.out.println(b3);
    }
}
