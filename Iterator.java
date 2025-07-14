package Java_Advance_3;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        java.util.Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());
    

        // Looping Through a Collection
        while(it.hasNext()) {
        System.out.println(it.next());
        }

        // Removing Items from a Collection
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        java.util.Iterator<Integer> its = numbers.iterator();
        while(its.hasNext()) {
            Integer i = its.next();
            if(i < 10) {
                its.remove();
            }
        }
        System.out.println(numbers);
    }
}
