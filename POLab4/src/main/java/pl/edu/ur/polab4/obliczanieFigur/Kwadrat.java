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
public class Kwadrat {
    
    int a;
    
    public int poleKwadratu(int a)
    {
        return a*a;
        
    }
    
    public int obwKwadratu(int a)
    {
        return 4*a;
    }
    
    public void pokDaneKwadratu()
    {
        System.out.println("Dane Kwadratu");
        System.out.println("bok kwadratu: "+a);
        System.out.println("pole kwadratu: "+poleKwadratu(a));
        System.out.println("obwód kwadratu: "+obwKwadratu(a));
                
    }
    
    
}
