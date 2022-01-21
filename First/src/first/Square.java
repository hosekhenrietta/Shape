/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import javafx.util.Pair;

/**
 * A Square a Shapes osztályból származik le
 * minden adattagja megvan, mint az alakzatoknak: középpont, oldal
 * overrideolja az absztrakt metódusokat
 * @author Aenrietta Aosek
 */
public class Square extends Shape{
    

    /**
     * Konstruktor, mely beállítja a négyzet adatait: középpont,oldal
     * Meghívja a terület, kerület és a kettő különbségét kiszámoló függvényeket
     */
    public Square(Pair<Float,Float> cent, float a){ 
        central = cent;
        A = a;
        type = "Square";
        
        CalculatePerimeter();
        CalculateArea();
        CalculateAreaPerimeterDifferece();
    }    
    /**
     * Kiszámolja a négyzet területét
     */
    @Override
    protected void CalculatePerimeter() {
         Perimeter = 4 * A;
    }
    /**
     * Kiszámolja a négyzet terüketét
     */
    @Override
    protected void CalculateArea() {
        Area = A * A;
    }
    

    
}
