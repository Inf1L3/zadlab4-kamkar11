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
public class Kula {
    
    final double pi = 3.14;
    double r;
    
    public double poleKuli(double r)
    {
        return 4*pi*r*r;
    }
    
    public double objKuli(double r)
    {
        return (4/3)*pi*(r*r*r);
    }
    
    public void pokDaneProstopadloscianu()
    {
        System.out.println("Dane Kuli: ");
        System.out.println("promień: "+r);
        System.out.println("pole: "+poleKuli(r));
        System.out.println("obwód kwadratu: "+objKuli(r));
                
    }
    
}
