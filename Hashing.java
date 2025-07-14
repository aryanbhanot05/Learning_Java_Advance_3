package Java_Advance_3;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {

        // HashSet
        HashSet <Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(4);
        h.add(6);
        h.add(7);
        h.add(7);
        h.add(9);
        h.add(10);

        System.out.println(h);

        // HashMap
        // Map<String, Integer> students=new HashMap<>();
    	Map<String, Integer> students=new Hashtable<>();
        // Hash table just make the hash map synchronized as only one thread can access
        // it at a time so its not needed to be used in multithreading applications.
    	
    	students.put("Navin",56);
    	students.put("Harsh",23);
    	students.put("Sushil",67);
    	students.put("Kiran",92);
    	students.put("Harsh",45);
    	
    	System.out.println(students.keySet());
    	
    	for(String key : students.keySet())
    	{
    		System.out.println(key + ":" + students.get(key));
    	}
    }
}
