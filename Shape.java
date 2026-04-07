package workshop_5;

abstract class Shape {
	abstract void CalculateArea();
	abstract void CalculatePerimeter();
	
}
class Quadrilateral extends Shape{
	int length = 7;
	int breadth= 6;
	
	@Override
	public void CalculateArea() {
		int Area = length *breadth;
		System.out.println("Area of quadrilateral : " + Area);
			
	}
	@Override
	void CalculatePerimeter() {
		int Perimeter = 2 *(length + breadth);
		System.out.println("Perimeter of quadrilateral:" + Perimeter);		
		
				
	}
		
	
}




