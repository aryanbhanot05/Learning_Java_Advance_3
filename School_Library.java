package Java_Advance_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class Students {
    protected String name;
    private int id;

    Students(){}
    Students(String n, int i){
        this.name = n;
        this.id = i;
    }
    
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}
}

class Books {
    String book_name;
    String book_author;

    Books(){}
    Books(String n,String a){
        this.book_name = n;
        this.book_author = a;
    }
}

class Lib {
    Boolean data_store = false;
    Scanner sc = new Scanner(System.in);
    LocalDateTime ldt = LocalDateTime.now();

    ArrayList<Books> books = new ArrayList<>();
    ArrayList<Students> stu = new ArrayList<>();
    Lib(){}
    // Lib(ArrayList<Books> books, ArrayList<Students> stu){
    //     this.books = books;
    //     this.stu = stu;
    // }

    public void AddStudents(Students stu){
        this.stu.add(stu);
        return;
    }

    public void AddBook(Books book){
        this.books.add(book);
        System.out.println("Thank you for the donation! '" + book.book_name + "' book written by '" + book.book_author + "' has been added to our library.");
        try {
            FileWriter fw = new FileWriter("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Books Record.txt",true);
            fw.write("Book '" +book.book_name + "' has been added at " + ldt + "\n\n");
            fw.close();
        } catch(IOException e){}
        return;
    }

    int wrong_input = 0;
    Boolean mis = false;
    Boolean stun = false;
    public void IssueBook(String book_needed){
        for(int i = 0; i < books.size(); i++){
            if (book_needed.equals(books.get(i).book_name)) {
                System.out.print("The book is available, please enter your credentials-\nname: ");
                String stu_name = sc.nextLine();
                System.out.print("Student ID: ");
                int stu_id = sc.nextInt();

                for (int j = 0 ; j < stu.size() ; j++){
                    if (stu_name.equals(stu.get(j).getName()) && stu_id == stu.get(j).getId()) {
                        System.out.println("The Book is issued on " + ldt + " to " + stu_name + ".\nHappy Reading! Enjoy the Book!");
                        books.remove(i);
                        try {
                            FileWriter fw = new FileWriter("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Books Record.txt",true);
                            fw.write("Book '" +book_needed + "' has been issued by " + stu_name + " at " + ldt + "\n\n");
                            fw.close();
                        } catch(IOException e){}
                        return;
                    }
                }
                stun = true;
            }
            mis = true;
        }

        if (mis) {
            wrong_input++;
            if  (wrong_input >= 3) {
                System.out.println("Access not permitted.");
                return;
            }
            System.out.print("Invalid Credentials! Try again!\nEnter the name of the book you want to issue: ");
            String newb = sc.nextLine();
            IssueBook(newb);
        }
        if (stun){
            wrong_input++;
            if  (wrong_input >= 3) {
                System.out.println("Access not permitted.");
                return;
            }
            System.out.println("Wrong entry! Try again.");
            IssueBook(book_needed); 
        }
    }

    public void ReturnBook(Books book){
        System.out.println("Books successfully returned on " + ldt + "!");
        AddBook(book);
        return;
    }
}

public class School_Library {
    public static void main(String[] args) {
    // Data Storage in files
        File f = new File("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Books Record.txt");
        if (f.exists()){} else {try {f.createNewFile();} catch (IOException e) {}}
        
        Scanner sc = new Scanner(System.in);

        // Create a Library object
        Lib library = new Lib();

        // Adding Students objects to the ArrayList
        library.AddStudents(new Students("Aryan Bhanot", 101));
        library.AddStudents(new Students("Devaaye Bhanot", 102));
        library.AddStudents(new Students("Mani Bhanot", 103));
        library.AddStudents(new Students("Naveen Bhanot", 104));
        library.AddStudents(new Students("Duggu Don", 105));
        library.AddStudents(new Students("Jintu Moshi", 106));

        // Adding initial books
        library.AddBook(new Books("A1", "A123"));
        library.AddBook(new Books("A2", "A123"));
        library.AddBook(new Books("A3", "A123"));
        library.AddBook(new Books("B1", "B321"));
        library.AddBook(new Books("B2", "B321"));

        // Students adding a book
        System.out.print("Enter the name of the book you want to donate: ");
        String bookAdded = sc.nextLine();
        System.out.print("Enter the name of the author os the book: ");
        String author = sc.nextLine();
        library.AddBook(new Books(bookAdded,author));

        // Example: Issue a book
        System.out.print("Enter the name of the book you want to issue: ");
        String bookName = sc.nextLine();
        library.IssueBook(bookName);

        // Example: Returning a book
        System.out.print("Enter the name of the book you want to return: ");
        String bookReturned = sc.nextLine();
        System.out.print("Enter the name of the author of the book: ");
        String aut = sc.nextLine();
        library.ReturnBook(new Books(bookReturned,aut));

        sc.close();
    }
}