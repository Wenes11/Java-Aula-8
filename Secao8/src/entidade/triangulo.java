package entidade;

public class triangulo {

 public double a;
 public double b;
 public double c;
 
 	public double areaxy() {
 		double p = (a+b+c)/2;
 		return Math.sqrt(p*(p-a) * (p-b) * (p-c));
 	}

}
