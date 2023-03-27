package operators;

public class Operations10 {
    public static void main(String[] args) {
       int number1= 100;
       int number2 = 200;
       int number3 = 300;

       System.out.println(true != true);

       System.out.println(10+20+30);//60
       
       //System.out.println((number1 > number2) > number3);//false  --> //false > 300
      
       System.out.println('A'==65);//true
       System.out.println('A' > 65); //false
       System.out.println('A' >= 65);//true
       System.out.println('A' < 65);//false
       System.out.println('A' <= 65);//true
       System.out.println('A' != 65);//false

       System.out.println(0 > 0);//false
       System.out.println(0 < 0);//false
       System.out.println(0 >= 0);//true
       System.out.println(0 <= 0);//true
       System.out.println(0 == 0);//true
       System.out.println(0 != 0);//false
      
        
    }
}