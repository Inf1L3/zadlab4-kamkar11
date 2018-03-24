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
public class Prostokat {
    
    int a,b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    
    
    public int poleProstokata(int a, int b)
    {
        return a*b;
    }
    
    public int obwProstokata(int a, int b)
    {
        return (2*a)+(2*b);
    }
    
    public void pokDaneProstokata()
    {
        System.out.println("Dane Prostokata");
        System.out.println("bok 1: "+a);
        System.out.println("bok 2: "+b);
        System.out.println("pole: "+poleProstokata(a, b));
        System.out.println("obwód: "+obwProstokata(a, b));
                
    }
}
