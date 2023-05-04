package array.day4;

public class CharArrayDigitPresentDemo2 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e','f'};
    //check digit is present or not : 0,1,2,...9
        for (char ch:chars) {
            if(ch>='0' && ch<='9'){
                System.out.println("Digit is present "+ch);
                break;
            }
        }

    }
}
