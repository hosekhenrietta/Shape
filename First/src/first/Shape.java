/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import javafx.util.Pair;

/**
 *
 * @author Henrietta Hosek
 * Absztrakt osztály, példányosítani nem lehet.
 * 
 * Ebből származnak le a különböző alakzatok
 */
public abstract class Shape {
    
    protected float A;
    protected String type;
    
    protected Pair<Float,Float> central;
    protected float Perimeter;
    protected float Area;
    protected float AreaPerimeterDifferece;
     /**
     * Kerület kiszámolására való absztrakt függvény
     */
    protected abstract void CalculatePerimeter();
     /**
     * Terület, kerület kiszámolására való absztrakt függvény
     */
    protected abstract void CalculateArea();
    /**
     * Terület, kerület különbségének kiszámolására való függvény
     */
    protected void CalculateAreaPerimeterDifferece(){
        if (Area > Perimeter) {
            AreaPerimeterDifferece = Area - Perimeter;
        } else {
            AreaPerimeterDifferece = Perimeter - Area;
        }
                
    }
    
    /*public Shape(char ch, Pair<Float,Float> cen, float num){
        if (ch == 'c') {
            Circle tmp = new Circle(cen,num);
        } else if (ch == 't'){
            Triangle tmp = new Triangle(cen, num);
        } else{
            
        }
        //CalculatePerimeter();
        //CalculateArea();
        //CalculateAreaPerimeterDifferece();
    }*/
    /**
     * Visszaadja a terület és kerület különbségét
     */
    public float getAreaPerimeterDifferece() { return AreaPerimeterDifferece;} 
    /**
     * Visszaadja kerületet
     */
    public float getPerimeter() { return Perimeter;}
    /**
     * Visszaadja területet
     */
    public float getArea(){ return Area;}
    /**
     * Consolera kiírja az alakzat adatait
     */
    public void printShape(){
        System.out.println("Type: " + type);
        System.out.println("A: " + A);
        System.out.println("Central: " + central.getKey() + "," + central.getValue());
        System.out.println("Perimeter: " + Perimeter);
        System.out.println("Area: " + Area);
        System.out.println("Differece between Area and Perimeter: " + AreaPerimeterDifferece);
    }
    
}
