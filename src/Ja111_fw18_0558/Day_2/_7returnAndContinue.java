package Ja111_fw18_0558.Day_2;

public class _7returnAndContinue {
    public static  void main(String[] args){
        //return
        System.out.println(returnDemo());
        //continue will land you here
        for(int i=0;i<3;i++){
            if(i==1){
                continue;
            }
            System.out.println("count :"+i);
        }
    }
    static String returnDemo(){
        //return is always the last statement


        return "string";
    }
}
