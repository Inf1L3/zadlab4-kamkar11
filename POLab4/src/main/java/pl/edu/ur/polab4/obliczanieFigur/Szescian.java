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
public class Szescian {
    
    int a;
    
    public int poleSzescianu(int a)
    {
        return 6*a*a;
    }
    
    public int objSzescianu(int a)
    {
        return a*a*a;
    }
    
    public void pokDaneSzescianu()
    {
        System.out.println("Dane Szescianu");
        System.out.println("krawedz: "+a);
        System.out.println("pole: "+poleSzescianu(a));
        System.out.println("obwód: "+objSzescianu(a));
                
    }
    
}
