package stringHandling;

public class Demo8Tokens {
    public static void main(String[] args) {
        String str = "welcome,to,string,handling";
        String[] strings = str.split(",");
        for (String temp : strings) {
            System.out.println(temp);
        }
        //str.reverse();
    }
}
