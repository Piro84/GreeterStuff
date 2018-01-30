package greeter;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeter one = new Greeter(10, "Joe");
		System.out.println(one.toString());
		
		Greeter[] greets = new Greeter[5];
		
		greets[0] = new Greeter(11, "Bob");
		greets[1] = new Greeter(12, "Billy");
		greets[2] = new Greeter(13, "Jacob");
		greets[3] = new Greeter(14, "Smith");
		greets[4] = new Greeter(15, "Paul");
		
		for(int i = 0; i < greets.length ; i++) {
			System.out.println(greets[i].toString());
		}
	}

}
