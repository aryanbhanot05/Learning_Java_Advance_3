package Java_Advance_3;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        // LinkedList is exact copy of ArrayList but with different implementation as it is memory efficient
        // and has a few more methods that can be used which are mentioned at the last in this file.

        // creating LinkedList
        int array[] = new int[5];   
        LinkedList<Integer> list = new LinkedList<Integer>();
        // LinkedList<Integer> list2 = new LinkedList<Integer>();

        // adding elements
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        // array[4] = 5;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // printing 1 element
        System.out.print(array[0]);
        System.out.print(array[2]);
        System.out.print(array[4] + "\n");        
        System.out.print(list.get(0));
        System.out.print(list.get(2));
        System.out.println(list.get(4));

        // Printing all elements at once
        for (int e : array) {
            System.out.print(e);
        }
        System.out.println("\n" + list);

        // add, edit or remove a particular index element
        list.remove(2);
        System.out.println(list);
        list.add(2, 30);
        System.out.println(list);
        list.set(2, 300);
        System.out.println(list);
        list.add(2, 30);
        System.out.println(list);

        // get size
        System.out.println(array.length);
        System.out.println(list.size());

        System.out.println();
        // Loops
        for(int i = 0 ; i < list.size() ; i++){   
            System.out.print(list.get(i));        
        }

        // Sorting
        Collections.sort(list);
        System.out.println(list);

        System.out.println();
        // Multidimentional LinkedList  
        LinkedList<LinkedList<Integer>> list2 = new LinkedList<LinkedList<Integer>>();
        list2.add(list);
        list2.add(list);
        System.out.println(list2);
        System.out.println(list2.size());

        // addLast LinkedList  -> # Not available in ArrayList
        list.addLast(4);
        System.out.println(list);


        // Array Deque
        // It basically has all same methods and functions only, but the main difference is that
        // we can insert or delete characters in front of the array and from the back of the array.
    }
}
