package module1_SingletonPattern;

public class Main {

	public static void main(String[] args) {
	
		 PersonType pt = PersonType.getInstance();
		 pt.Name();
		 System.out.println(pt.getName());
	}
}