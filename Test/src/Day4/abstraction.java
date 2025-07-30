package Day4;
abstract class Animal {
    abstract void sound();
    
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class abstraction {
	public static void main(String []args) {
		Animal obj = new Dog();
        obj.sound();  // Output: Bark
        obj.sleep();  // Output: Sleeping...
    
		
	}

}
