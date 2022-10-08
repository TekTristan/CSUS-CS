// Your name here: Tristan Dinh


package main;
import add.Add;
import subtract.Subtract;
import modulo.Modulo;
import divide.Divide;
import multiply.Multiply;

public class Lab04 {
	
public static void main(String[] args) {
	System.out.println("Hello World!");
	Add a = new Add(5,3);
	System.out.println(a.toString());
	a.changeVals(4, 4);
	System.out.println(a.toString());
	
	Subtract s = new Subtract(5,3);
	System.out.println(s.toString());
	s.changeVals(4, 4);
	System.out.println(s.toString());
	
	Modulo mod = new Modulo(5,3);
	System.out.println(mod.toString());
	mod.changeVals(4, 4);
	System.out.println(mod.toString());
	
	Divide d = new Divide(5,3);
	System.out.println(d.toString());
	d.changeVals(4, 4);
	System.out.println(d.toString());
	
	Multiply m = new Multiply(5,3);
	System.out.println(m.toString());
	m.changeVals(4, 4);
	System.out.println(m.toString());

	 
}

	
	

}
