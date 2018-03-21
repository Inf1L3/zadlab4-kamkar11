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
        Student s5 = new Student("Jan", 2017);
        
        s1.pokarzDane();
        s2.pokarzDane();
        s3.pokarzDane();
        s4.pokarzDane();
        s5.pokarzDane();
        
        // zad3 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Podaj imię: ");
        String imie = input.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = input.next();
        System.out.println("Podaj nr indeksu: ");
        int nr_indeksu = input.nextInt();
        System.out.println("Podaj nazwę specjalności: ");
        String nazwa_specjalnosci = input.next();
        System.out.println("Podaj rok studiów: ");
        int rok_studiow = input.nextInt();
        
        /*
        Student s5 = new Student(imie, nazwisko);
        Student s6 = new Student(nr_indeksu);
        Student s7 = new Student(nazwa_specjalnosci);
        */
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(nr_indeksu);
        System.out.println(nazwa_specjalnosci);
        System.out.println(rok_studiow);
        
        // zad 4
        
        
    }
    
}
