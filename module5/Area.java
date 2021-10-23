package module5;

public abstract class Area {
	
	public abstract void circle();
	public abstract void triangle();
	public void rectangle(double width, double rectangleHeight) 
	{
		double rectangleArea = (width * rectangleHeight);
		System.out.println(rectangleArea);
	}

}
