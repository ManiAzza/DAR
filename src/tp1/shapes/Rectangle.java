package shapes;

public class Rectangle {
    //attributes
	public int a ; 
	public int b ;
	
    //methods
    public void perimeter(int a , int b ){
    	int p = (a+b)*2 ; 
    	
        System.out.println("Perimeter : " +p );
    }

    public void surface(int a , int b ){
        System.out.println("Surface : "+ (a*b));
    }
}
