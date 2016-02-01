

public class Triangle2 {
	
	static TriangleType getTriangleType(int a, int b, int c){
		if(a<0 || b<0 || c<0)
			throw new IllegalArgumentException("Length of sides cannot be less than zero!");
		
		if(a > b+c || b > a+c || c > a+b)
			throw new IllegalArgumentException("Not a valid Triangle. Length of one side is greater than the sum of the other two sides");
		
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
