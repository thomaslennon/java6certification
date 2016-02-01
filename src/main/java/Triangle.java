
public class Triangle {
	
	private int a, b, c;
	
	public Triangle(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		
		if(a<0 || b<0 || c<0)
			throw new IllegalArgumentException("Length of sides cannot be less than zero!");
		
		if(a > b+c || b > a+c || c > a+b)
			throw new IllegalArgumentException("Not a valid Triangle. Length of one side is greater than the sum of the other two sides");
	
	}
	
	
	public TriangleType getType (){
		
		if(a == b && b== c)
			return TriangleType.EQUILATERAL;
		else if (a == b || b == c || c == a)
			return TriangleType.ISOSCELES;
		else 
			return TriangleType.SCALENE;
	}
	
		
	enum TriangleType{
		SCALENE, ISOSCELES, EQUILATERAL;
	}

}
