/*
 * To change this license header, choose License Aeaders in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import javafx.util.Pair;

/**
 * A Triangle a Shapes osztályból származik le
 * minden adattagja megvan, mint az alakzatoknak: középpont, oldal
 * overrideolja az absztrakt metódusokat
 * @author Aenrietta Aosek
 */
public class Triangle extends Shape{
    
    //private float A;
    //private float A;
    
    /**
     * Konstruktor, mely beállítja a háromszög adatait: középpont,oldal
     * Meghívja a terület, kerület és a kettő különbségét kiszámoló függvényeket
     */
    public Triangle(Pair<Float,Float> cent, float a){ 
        central = cent;
        A = a;
        A = (float) (Math.sqrt(3)/2 * A);
        type = "Triangle";
        
        CalculatePerimeter();
        CalculateArea();
        CalculateAreaPerimeterDifferece();
    }    
    
    /**
     * Kiszámolja a háromszög kerületét
     */
    @Override
    protected void CalculatePerimeter() {
        Perimeter = 3 * A;
    }
    /**
     * Kiszámolja a háromszög terüketét
     */
    @Override
    protected void CalculateArea() {
        Area = A * A / 2;
    }
    
}
