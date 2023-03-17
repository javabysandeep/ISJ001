public class SwitchDemo1 {
    public static void main(String[] args) {
        byte value=10;
         //byte, short, int, char, String, enum
        switch(value){
            case 1 :System.out.println("One");break;
            case 2 :System.out.println("Two");break;
            case 3 :System.out.println("Three");break;
            default : System.out.println("Invalid number");break;
        }

    }
}