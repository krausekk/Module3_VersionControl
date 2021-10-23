package module5;

public class module5Assignment extends Area{

	public static void main(String[] args) {
	module5Assignment module = new module5Assignment();
	
	module.circle();
	module.triangle();
	module.rectangle(width, rectangleHeight);
	
	}
	double r = 15;
	double base = 5;
	double height = 8;
	static double width = 5;
	static double rectangleHeight = 10;
	
	@Override
	public void circle() {
		double circleArea = (3.14 * r);
		System.out.println(circleArea);
		
	}

	@Override
	public void triangle() {
		double triangleArea = (.5 * base * height);
		System.out.println(triangleArea);
		
	}

}
