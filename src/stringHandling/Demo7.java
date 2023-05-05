package stringHandling;

public class Demo7 {
    public static void main(String[] args) {
        String str ="String handling helps us with predefined set of methods";
        System.out.println("Whether it starts with String " + str.startsWith("g"));
        System.out.println("Whether it ends with methods " + str.endsWith("methods"));

        System.out.println("Is it present "+str.contains("us"));
    }
}
