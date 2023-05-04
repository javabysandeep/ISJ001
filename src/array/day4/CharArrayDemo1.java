package array.day4;

public class CharArrayDemo1 {
    public static void main(String[] args) {
        char[] charArray = new char[10];
        char[] chars = {'w','e','l','c','o','m','e'};

        //accessing the array with enhanced for loop
        for (char ch:chars) {
            System.out.print(ch+" ");
        }
        System.out.println("Length of char array "+chars.length);

    }
}
