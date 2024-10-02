import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//    //Syntax
////        int[] rnops=new int[5];
//////        int[] rnos2={11,22,332,21};
////        System.out.println(rnops[0]);
////        String[] str = new String[4];
////        System.out.println(str[0]);
//        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=54;
//        arr[3]=44;
//        arr[4]=33;
//        System.out.println(arr[3]);
//
//        for(int num :arr){
//            System.out.println(num+" ");
//
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i] + " ");
        ArrayList<ArrayList> list = new ArrayList<>(10);
//        list.add(69);
//        list.add(72);
//        list.add(64);
//        list.add(45);
//        list.add(655);
//        list.set(0,99);
//        System.out.println(list);
        for(int i=0;i<3;i++){
            list.add(new ArrayList());
        }
        for(int i=0;i<3;i++){
//            System.out.println(list.get(i));
            for(int j=0;j<3;j++){

               list.get(i).add(in.nextInt());

            }
        }
        }
    }
