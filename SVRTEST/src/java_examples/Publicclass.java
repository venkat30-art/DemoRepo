package java_examples;

public class Publicclass {
	void run() {
		System.out.println("run executed");
	}
	void jump() {
		System.out.println("jump executed");
	}
	void walk() {
		System.out.println("walk is executed");
	}

	public static void main(String[] args) {
         Publicclass obj = new Publicclass();
         obj.run();
         obj.jump();
         obj.walk();
	
	}
}

