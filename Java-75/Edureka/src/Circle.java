
public class Circle extends Shape {
	float radius;
	
	public Circle(String color, float radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println("Area of Circle = "+(3.14f*radius*radius));
	}
}
