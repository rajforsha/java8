package defaultMethodInJava8;

/**
 * @author vagrant
 *
 */

class A implements DefaultInterface {

	public void print() {
		System.out.println("default interface method can be override by class implementaing it.");
	}
}

class B implements DefaultInterface {

}

public class DefaultInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		a.print();
		B b = new B();
		b.print();
		DefaultInterface.display();
	}

}
