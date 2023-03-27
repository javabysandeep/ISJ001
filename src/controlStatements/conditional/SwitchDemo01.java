package controlStatements.conditional;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //value can be of type: byte, short, int, char, String, enum
        //wrapper classes: Byte, Short, Integer, Character
        int value = 4;
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                System.out.println("Three");
                System.out.println("Three");
                break;
            default:
                System.out.println("no matching case.");
                break;
        }
    }
}
