public class DLL {
   private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("End");
    }
    public void displayRev(){
        Node node = head;
        Node last = null;
        while(node!=null){
//            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
//        System.out.println("End");
        while (last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
        System.out.println("Start");
    }
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
