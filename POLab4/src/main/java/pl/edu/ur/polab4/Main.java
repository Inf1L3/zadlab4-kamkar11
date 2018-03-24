package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.obliczanieFigur.Kolo;
import pl.edu.ur.polab4.obliczanieFigur.Kula;
import pl.edu.ur.polab4.obliczanieFigur.Kwadrat;
import pl.edu.ur.polab4.obliczanieFigur.Prostokat;
import pl.edu.ur.polab4.obliczanieFigur.Prostopadloscian;
import pl.edu.ur.polab4.obliczanieFigur.Stozek;
import pl.edu.ur.polab4.obliczanieFigur.Szescian;

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
        System.out.println("podaj liczbe od 1 do 7");
        int n = input.nextInt();

        if (n == 1) {
            System.out.println("Podaj r: ");
            double r = input.nextDouble();
            Kolo k1 = new Kolo(r);

            k1.pokDaneKola();
        } else if (n == 2) {
            System.out.println("Podaj a: ");
            int a = input.nextInt();
            Kwadrat kw1 = new Kwadrat(a);
            kw1.pokDaneKwadratu();

        } else if (n == 3) {
            System.out.println("Podaj a: ");
            int a = input.nextInt();
            System.out.println("Podaj b: ");
            int b = input.nextInt();
            Prostokat p1 = new Prostokat(a, b);
            p1.pokDaneProstokata();
        } else if (n == 4) {
            System.out.println("Podaj a: ");
            int a = input.nextInt();
            Szescian sz1 = new Szescian(a);
            sz1.pokDaneSzescianu();
        } else if (n == 5) {
            System.out.println("Podaj a: ");
            int a = input.nextInt();
            System.out.println("Podaj b: ");
            int b = input.nextInt();
            System.out.println("Podaj h:");
            int h = input.nextInt();
            Prostopadloscian prost1 = new Prostopadloscian(a, b, h);
            prost1.pokDaneProstopadloscianu();

        } else if (n == 6) {
            System.out.println("Podaj r: ");
            double r = input.nextDouble();
            Kula k1 = new Kula(r);
            k1.pokDaneKuli();
        } else if (n==7)
        {
            System.out.println("Podaj r: ");
            double r = input.nextDouble();
            System.out.println("Podaj l: ");
            double l = input.nextDouble();
            System.out.println("Podaj h: ");
            double h = input.nextDouble();
            Stozek st1 = new Stozek(r, l, h);
            st1.pokDaneStozka();
        }
        else 
        {
            System.out.println("Zły wybór !!!");
        }

    }

}
