package Java_Advance_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Array_List {
    public static void main(String[] args) {
        // creating Array List
        int array[] = new int[5];
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<Integer> list2 = new ArrayList<Integer>();

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
        list.add(42);
        list.add(32);
        list.add(52);

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

        System.out.println();
        // Multidimentional Array and Array List
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
        list2.add(list);
        list2.add(list);
        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println("\n");

        // A different way or we can say - using forEach
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        num.forEach(n -> System.out.println(n));

        int sum = 0;
        for(int n:num){
            sum += n;
        }
        System.out.println("Sum of elements in the array is : " + sum);

        // Stream API

        // Exact copy of the array list that we are working on.
        // But  if we change it, there would be no effect on the original array list.
        Stream<Integer> s1 = num.stream();
        s1.forEach(n -> System.out.println(n));
        System.out.println();

        // Will remove all the elements from the stream array hat are eligible for the condition we give.
        Stream<Integer> s2 = num.stream().filter(n -> n%2 == 0);
        s2.forEach(n -> System.out.println(n));
        System.out.println();

        // Map adjust help us to do the thing to particular element which we want to perform on them.
        Stream<Integer> s3 = num.stream().map(n -> n*2);
        s3.forEach(n -> System.out.println(n));
        System.out.println();

        // Getting the sum of all elements in the array
        Stream<Integer> s4 = num.stream().map(n -> n*2);
        int result = s4.reduce(0,(c,e) -> c+e);
        System.out.println(result);

        // Easy way to do this is:
        int result2 = num.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .reduce(0,(c,e) -> c+e);
        System.out.println(result2);
    }
}