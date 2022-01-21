/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import javafx.util.Pair;

/**
 * A Circle a Shapes osztályból származik le
 * minden adattagja megvan, mint az alakzatoknak: középpont, oldal(ami itt sugár)
 * overrideolja az absztrakt metódusokat
 * @author Aenrietta Aosek
 */
public class Circle extends Shape {

    //protected float R;
    private final double PI = Math.PI;
    /**
     * Konstruktor, mely beállítja a kör adatait: középpont,sugár
     * Meghívja a terület, kerület és a kettő különbségét kiszámoló függvényeket
     */
    public Circle(Pair<Float,Float> cent, float r){ //
        A = r;
        central = cent;
        type = "Circle";
        
        CalculatePerimeter();
        CalculateArea();
        CalculateAreaPerimeterDifferece();
    }
    
    /**
     * Kiszámolja a kör kerületét
     */
    @Override
    protected void CalculatePerimeter() {
      Perimeter = (float) (2 * PI * A);
    }
    /**
     * Kiszámolja a kör terüketét
     */
    @Override
    protected void CalculateArea() {
       Area = (float) (A * A * PI);
    }
    
}
