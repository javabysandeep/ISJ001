package stringHandling;

public class Demo4 {
    public static void main(String[] args) {
        String str = "welcome to String handling session";
        str = str.toUpperCase();
        System.out.println(str);
        System.out.println("Convert back to lowercase");
        str = str.toLowerCase();
        System.out.println(str);

        String topic = "welcome to String handling session";
       topic=  topic.replace("String","Exception");
        System.out.println(topic);

        String spaces = "                               welcome to Space             ";
        spaces = spaces.trim();
        System.out.println("Spaces length "+spaces.length());
        System.out.println(spaces);

    }
}
