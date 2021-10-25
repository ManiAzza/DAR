package tp1.shapes;

public class Main {
    public static void main(String[] args) {
        
        Triangle A = new Triangle() ;
    	A.perimeter(5, 2, 3);
    	A.surface(50, 20, 33);
    	
    	Rectangle B = new Rectangle() ; 
    	B.perimeter(4, 5);
    	B.surface(5, 6);
        // if I want to create a new shape (for example square)
        // how can I force the implementation of perimeter and surface on that shape ?
    }
}
