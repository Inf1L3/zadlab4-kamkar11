/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author XYZ
 */
public class Stozek {
    
    double r,l,h;
    final double pi = 3.14;

    public Stozek(double r, double l, double h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }
    
    
    
    public double poleStozka(double r, double l)
    {
        return (pi*r*r)+(pi*r*l);
    }
    
    public double objStozka(double r, double l)
    {
        return (1/3)*pi*r*r*h;
    }
    
     public void pokDaneStozka()
    {
        System.out.println("Dane Stożka: ");
        System.out.println("promień: "+r);
        System.out.println("tworzaca: "+l);
        System.out.println("wysokość: "+h);
        System.out.println("pole: "+poleStozka(r, l));
        System.out.println("obwód: "+objStozka(r, l));
                
    }
}
