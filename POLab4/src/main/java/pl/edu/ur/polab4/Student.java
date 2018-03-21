package pl.edu.ur.polab4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Student {
    
     String imie;
     String nazwisko;
     int nr_indeks;
    String nazwa_specjalnosci;
    int rok_studiow;

    public Student(String imie,String nazwisko) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        
        
    }
    public Student(String nazwisko,int rok_studiow)
    {
        this.nazwisko = nazwisko;
        this.rok_studiow = rok_studiow;
    }
    
    public Student(int nr_indeks)
    {
        this.nr_indeks = nr_indeks;
    }
    
    public Student(String nazwa_specjalnosci)
    {
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }
    
    public Student(int rok_studiow,int nr_indeks)
    {
        this.rok_studiow = rok_studiow;
        this.nr_indeks = nr_indeks;
    }
    
    public void pokarzDane()
    {
        System.out.println("Imię: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("nr indeksu: "+nr_indeks);
        System.out.println("nazwa spec: "+nazwa_specjalnosci);
        System.out.println("Rok studiów: "+rok_studiow);
    }

    
    
    
    
    
}
