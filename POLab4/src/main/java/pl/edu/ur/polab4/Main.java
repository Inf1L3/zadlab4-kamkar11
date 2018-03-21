package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        
        /*
        Student stud1 = new Student("Karol", "Kowalski", 21);
        stud1.toString();
        
        Student stud2 = new Student("Jan", nazwisko, 0)
        */
        
        
        // zad2
        Student s1 = new Student("Jan", "Matura");
        Student s2 = new Student(43);
        Student s3 = new Student("budowa maszyn");
        Student s4 = new Student(1, 43);
        
        s1.pokarzDane();
        s2.pokarzDane();
        s3.pokarzDane();
        s4.pokarzDane();
        
        // zad3 
        Scanner input = new Scanner(System.in);
        
        
    }
    
}
