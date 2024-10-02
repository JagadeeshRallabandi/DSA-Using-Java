public class Comparision {
    public static void main(String[] args) {
        String a = "Jagadeesh";
        String b = "Jagadeesh";
        System.out.println(a==b);

        String name1 =  new String("Jagadeesh");
        String name2 = new String("Jagadeesh");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
