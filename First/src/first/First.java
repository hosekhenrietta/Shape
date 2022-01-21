package first;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import javafx.util.Pair;

/**
 *
 * @author Hosek Henrietta
 */
public class First {
    
    public static Collection<Shape> myShapes = new LinkedList<Shape>();
    
     /**
     * Paraméternek egy stringet kap, ami egy file neve kiterjesztéssel együtt
     * A file első sorában egy szám van, ami a további sorórok (alakzatok) számát jelzi
     * Ezt a filet beolvassa, feldolgozza és minden sorra meghívja a readShape függvényt
     */
    private static void readFile(String fileName){
        RandomAccessFile raf;
        String row;
 
        try
        {
            raf = new RandomAccessFile(fileName,"r");

            int rowNum = 0;
            row = raf.readLine();
            rowNum = Integer.parseInt(row);  
            
            if (rowNum > 0) {
                
                for (int i = 0; i < rowNum; i++) {
                row = raf.readLine();
                readShape(row);
                //System.out.println(row);
                }
            } else {
                System.out.println("There isnt any Shape in this file: " + fileName);
            }
            

            raf.close();
        }
        catch( IOException e )
        {
          System.err.println("This file is not exist");
        }
        

    }
     /**
     * Paraméternek egy stringet kap, ami a file egyik sorát tartalmazza
     * Ezt feldolgozza, és az adatokból csinál egy alakzatot, amit beletesz a myShapes collectionbe
     */
    private static void readShape(String row){

        String[] array = row.split(" "); 
        //ez nem biztos hogy mukodik, ha több space van regularis kifejezés
        
        char type = array[0].charAt(0);
        Pair<Float,Float> cen;
        cen = new Pair<>(Float.parseFloat(array[1]),Float.parseFloat(array[2]));
        float num = Float.parseFloat(array[3]);
        
        Shape newShape = null;
        
        switch(type) {
            case 'c':
              newShape = new Circle(cen,num);
              myShapes.add(newShape);
              break;
            case 't':
              newShape = new Triangle(cen,num);
              myShapes.add(newShape);
              break;
            case 's':
              newShape = new Square(cen,num);
              myShapes.add(newShape);
              break;
            case 'h':
              newShape = new Hexagon(cen,num);
              myShapes.add(newShape);
              break;
            default:
                System.out.println("There was an unknown shape type in the file: " + type );
        }
        
        //newShape.printShape();

        
    }
    /**
     * Megkeresi a myShapes collectionben azt az alakzatot, aminek a AreaPerimeterDifferece változója a legkisebb
     */
    private static Shape searching(Collection<Shape> myShapes){
        Shape result = null;
        float min = Float.MAX_VALUE;
        
        for (Iterator<Shape> it = myShapes.iterator(); it.hasNext();) {
            Shape tmp = it.next();
            
            /*if (min == -1) {
                result = tmp;
                min = tmp.getAreaPerimeterDifferece();
            } else */
                if (min > tmp.getAreaPerimeterDifferece()) {
                result = tmp;
                min = tmp.getAreaPerimeterDifferece();
                //System.out.print("ez az uj min ");
                //tmp.printShape();
            }
        }
        
        return result;
    }

    /**
     * mainben hívódik meg a fájl beolvasás függvénye, majd a megoldás keresés függvénye és végűl kiíródik a megoldás
     */
    public static void main(String[] args) {
        
        readFile("test1.txt");
       
        if (!myShapes.isEmpty()) {
            Shape result = searching(myShapes);
            System.out.println("___________________________________________________");
            System.out.println("Result: ");
            result.printShape();
        }

        
    }
    
}

