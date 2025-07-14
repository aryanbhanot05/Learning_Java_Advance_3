package Java_Advance_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;  
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        File f = new File("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Sameer Kaalu Madari.txt");

        // Creating file
        if (f.exists()) {
            System.out.println("Directory exists");
        } else {
            System.out.println("Directory created.");
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("Some error occured.");
            }  
        }

        // Writing some text in file
        try {
            FileWriter fw = new FileWriter("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Sameer Kaalu Madari.txt");
            fw.write("Sona Munda Sameer! Pushkar Padora, Padmare Thoda Thoda.");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // getting file info
        System.out.println("File name: " + f.getName());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Writeable: " + f.canWrite());
        System.out.println("Readable " + f.canRead());
        System.out.println("File size in bytes " + f.length());

        // Reading some text from the file
        // File f = new File("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Sameer Kaalu Madari.txt");
        // File already initiated while creating
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // // Deleting a particular file
        // if (f.exists()){
        //     f.delete();
        //     System.out.println(f.getName() + " deleted successfully!");
        // } else {
        //     System.out.println("The file doesn't exist.");
        // }

        // Here is a folder with multiple files each having multiplication table from 2 to 9.
        for (int i = 2 ; i < 11 ; i++) {
            // Creating
            File mul = new File("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Multiplication table of " + i + ".txt");
            if (mul.exists()) {
                System.out.println("Directory exists");
            } else {
                System.out.println("Directory created.");
                try {
                    mul.createNewFile();
                } catch (IOException e) {
                    System.out.println("Some error occured.");
                }  
            }

            // Writing
            try {
                FileWriter mulw = new FileWriter("C:\\PC DATA\\Computer Science\\Java\\Java_Advance_3\\Files\\Multiplication table of " + i + ".txt");
                for (int j = 1; j < 11 ; j++) {
                    mulw.write(i + " x " + j + " = " + i*j + "\n");
                }
                mulw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}