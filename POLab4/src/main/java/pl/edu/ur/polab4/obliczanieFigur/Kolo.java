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
public class Kolo {

    double r;
    final double pi = 3.14;

    public Kolo(double r) {
        this.r = r;
    }
    
    public double poleKola(double r)
    {
        return pi*(r*r);
    }
    
    public double obwKola(double r)
    {
        return 2*pi*r;
    }
    
    public void pokDaneKola()
    {
        System.out.println("Dane Kola");
        System.out.println("promień: "+r);
        System.out.println("pole koła: "+poleKola(r));
        System.out.println("obwód koła: "+obwKola(r));
                
    }

}
