import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name="Jagadeesh Rallabandi";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Jagadeesh   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}