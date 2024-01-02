import MyFirstLinkedList.MyLinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> myList1 = new MyLinkedList<>();
        myList1.addLast(123);
        myList1.addLast(124);
        myList1.addLast(125);
        myList1.addFirst(126);
        myList1.addFirst(127);
        myList1.addFirst(128);

        System.out.println(myList1.size());

        for (int m :  myList1){
            System.out.println(m);
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Iterator iterator1 = myList1.descendingIterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println(myList1);

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        MyLinkedList<String> myList2 = new MyLinkedList<>();
        myList2.addLast("QWE");
        myList2.addLast("QWR");
        myList2.addLast("QWT");
        myList2.addFirst("QWY");
        myList2.addFirst("QWU");
        myList2.addFirst("QWI");

        System.out.println(myList2.size());

        for (String m :  myList2){
            System.out.println(m);
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Iterator iterator2 = myList2.descendingIterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println(myList2);



    }
}