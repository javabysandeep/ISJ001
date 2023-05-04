package array.day4;

public class CharArrayReverseDemo5 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int index = chars.length - 1; index >= 0; index--) {
            System.out.print(chars[index] + " ");
        }
    }
}
