package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;
import pl.edu.ur.polab4.Student;

public class Zadanie5 {

    Scanner input = new Scanner(System.in);

    Student[] tabS = new Student[100];

    public void wypelnienieTab() {
        for (int i = 0; i < 100; i++) {
            tabS[i] = new Student("", 0);
        }
    }

    public void wprDane() {
        System.out.println("Podaj index tablicy do której wprowadzisz dane: ");
        int i = input.nextInt();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = input.next();
        tabS[i].setNazwisko(nazwisko);
        System.out.println("Podaj rok studiów: ");
        int rokSt = input.nextInt();
        tabS[i].setRok_studiow(rokSt);

    }

    public void edycjaDanych() {

        System.out.println("Podaj index który chcesz edytować: ");
        int i = input.nextInt();

        System.out.println("Aktualne nazwisko: " + tabS[i].getNazwisko());
        System.out.println("Podaj nowe nazwisko: ");
        String nazwisko = input.next();
        tabS[i].setNazwisko(nazwisko);
        System.out.println("Aktualny rok studiów: " + tabS[i].getRok_studiow());
        System.out.println("Podaj rok studiów: ");
        int rokSt = input.nextInt();
        tabS[i].setRok_studiow(rokSt);
    }

    public void usunDane() {

        System.out.println("Podaj index który chcesz usunąć: ");
        int i = input.nextInt();

        tabS[i].setNazwisko("");
        tabS[i].setRok_studiow(0);

    }

    public void wyswietlDane() {
        System.out.println("Podaj index który chcesz wyswietlic: ");
        int i = input.nextInt();

        System.out.println("Nazwisko " + tabS[i].getNazwisko() + " Rok studiów: " + tabS[i].getRok_studiow());
    }

    public void daneStudentow() {
        for (int i = 0; i < 100; i++) {
            System.out.println("  ");
            System.out.println("Index: " + i);
            System.out.println("Nazwisko: " + tabS[i].getNazwisko());
            System.out.println("Rok Studiow:" + tabS[i].getRok_studiow());
        }
    }

    public void wysZakres() {
        System.out.println("Podaj początkowy index: ");
        int p = input.nextInt();
        System.out.println("Podaj końcowy index: ");
        int k = input.nextInt();

        for (int i = p; i <= k; i++) {
            System.out.println("  ");
            System.out.println("Index: " + i);
            System.out.println("Nazwisko: " + tabS[i].getNazwisko());
            System.out.println("Rok Studiow:" + tabS[i].getRok_studiow());
            System.out.println("==========================================");
        }
    }

}
