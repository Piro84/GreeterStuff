package greeter;

public class Greeter {
	
	private int age;
	private String name;
	
	public Greeter() {
		age = 0;
		name = "";
	}
	
	public Greeter(int ageX, String nameX) {
		age = ageX;
		name = nameX;
	}
	
	public String toString() {
		String temp = ("Greeter: age: " + age + ", name: " + name);
		return temp;
	}
}
