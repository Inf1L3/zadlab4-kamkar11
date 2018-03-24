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
public class Prostopadloscian {
    
    int a,b,h;
    
    public int poleProstopadloscianu(int a, int b)
    {
        return 2*a*b+2*b*h+2*a*h;
    }
    
    public  int objProstopadloscianu(int a, int b)
    {
        return a*b*h;
    }
    
    public void pokDaneProstopadloscianu()
    {
        System.out.println("Dane Prostopadloscianu");
        System.out.println("bok 1: "+a);
        System.out.println("bok 2: "+b);
        System.out.println("wysokosc: "+h);
        System.out.println("pole: "+poleProstopadloscianu(a, b));
        System.out.println("obwód: "+objProstopadloscianu(a, b));
                
    }
        
    
}
