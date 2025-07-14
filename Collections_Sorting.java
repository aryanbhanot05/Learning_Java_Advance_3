package Java_Advance_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age;

    Student(int age , String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}

    @Override
    public int compareTo(Student that) {
        if (this.age >  that.age){
            return 1;
        } else{
            return -1;
        } 
    }
}
public class Collections_Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(42);
        list.add(32);
        list.add(52);

        // Sorting using Comparator vs Comparable
        // Requirement is that I have to arrange the numbers according to
        // the increasing order of unit digit. (Applicable for two digit number only)
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i ,Integer j){
                if (i % 10 > j % 10){
                    return 1;
                    // If we return one, the number will swap otherwise it will not swap.
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(list , com);   
        System.out.println(list);

        // Sorting using Collection Framework
        Collections.sort(list);
        System.out.println(list);

        // Exercise for sorting students named according to their age.
        System.out.println();

        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student(19, "Aryan"));
        studs.add(new Student(14, "Devaaye"));
        studs.add(new Student(45, "Naveen"));
        studs.add(new Student(41, "Mani"));

        // Display the data
        for (Student s : studs){
            System.out.println(s);
        }
        System.out.println();

        // Sort by age
        Comparator<Student> c = (Student i ,Student j) ->i.age > j.age?1:-1;

        Collections.sort(studs,c);
        for (Student s : studs){
            System.out.println(s);
        }
        System.out.println();

        // Another way to do the same thing is using comparable.

        Collections.sort(studs);
        for (Student s : studs){
            System.out.println(s);
        }
    }
}
