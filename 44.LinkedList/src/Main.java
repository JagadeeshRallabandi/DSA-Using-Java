import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer>list = new LinkedList<>();
//        list.add(5);
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(33);
//        list.insertFirst(36);
//        list.insertFirst(37);
//
//        list.display();
//        list.insertlast(99);
//        list.display();
//        list.insert(100,5);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(33);
        list.insertFirst(36);
        list.insertFirst(37);
        list.display();
        list.displayRev();
    }
}