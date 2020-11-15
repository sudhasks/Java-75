
public class AbsTest {

	public static void main(String[] args) {
		Shape s = null;
		//s = new Shape(); //cannot instantiate
		s = new Rectangle("Yellow",12,6);
		System.out.println("Color = "+ s.getColor());
		s.setColor("Red");
		s.area();
		System.out.println();
		
		s = new Circle("Blue",10.6f);
		s.area();
	}

}
