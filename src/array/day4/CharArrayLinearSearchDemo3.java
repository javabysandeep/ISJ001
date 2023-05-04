package array.day4;

public class CharArrayLinearSearchDemo3 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        //linear search
        //check given char is present in the array
        char key = 'f';
        for (char ch : chars) {
            if (ch == key) {
                System.out.println("char is present " + ch);
                break;
            }
        }

    }
}
