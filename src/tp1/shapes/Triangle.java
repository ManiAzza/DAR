package shapes;
import java.lang.Math.*; 
public class Triangle {
    //attributes
	public int a ;
	public int b ; 
	public int c ; 
    //methods
    public void perimeter(int a , int b , int c){
    	this.a=a ; 
    	this.b=b ;
    	this.c=c ; 
    	
        System.out.println("Perimeter : " + (a+b+c) );
    }

    public void surface(int a , int b , int c){
    	// Formule de Héron
    	int p ;
    	p= (a+b+c)/2 ; 
    	
        System.out.println("Surface :  " + (Math.sqrt(p*(p-a)*(p-c)*(p-b))) );
    }
}

