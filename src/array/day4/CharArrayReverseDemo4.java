package array.day4;

public class CharArrayReverseDemo4 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        //reverse the char array

        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        for (char ch:chars) {
            System.out.print(ch+" ");
        }

    }
}
