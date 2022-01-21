/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import javafx.util.Pair;

/**
 * A Hexagon a Shapes osztályból származik le
 * minden adattagja megvan, mint az alakzatoknak: középpont, oldal
 * overrideolja az absztrakt metódusokat
 * @author Aenrietta Aosek
 */
public class Hexagon extends Shape{

    //private float A;
    /**
     * Konstruktor, mely beállítja a hatszög adatait: középpont,oldal
     * Meghívja a terület, kerület és a kettő különbségét kiszámoló függvényeket
     */
    public Hexagon(Pair<Float,Float> cent, float a){ 
        central = cent;
        A = a;
        type = "Hexagon";
        
        CalculatePerimeter();
        CalculateArea();
        CalculateAreaPerimeterDifferece();
    }
    /**
     * Kiszámolja a hatszög kerületét
     */
    @Override
    protected void CalculatePerimeter() {
        Perimeter = 6 * A;
    }
    /**
     * Kiszámolja a hatszög terüketét
     */
    @Override
    protected void CalculateArea() {
        Area = (float) (3 * Math.sqrt(3)/2 * A * A);
    }
    
}
