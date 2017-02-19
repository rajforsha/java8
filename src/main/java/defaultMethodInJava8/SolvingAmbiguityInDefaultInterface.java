package defaultMethodInJava8;

/**
 * @author vagrant
 *
 */
interface I1 {
	default void print() {
		System.out.println("interface I1");
	}
}

interface I2 {
	default void print() {
		System.out.println("interface I2");
	}
}

/*
 * class ImplementingBothInterface implements I1,I2{ // gives error since we are
 * implementing both interface should provide our implementation }
 */

class ImplementingBothInterface1 implements I1, I2 {

	public void print() {
		System.out.println("defining own implementation since having ambiguity.");
	}
}

class ImplementingBothInterface2 implements I1, I2 {

	public void print() {
		I1.super.print();
		I2.super.print();
	}
}

public class SolvingAmbiguityInDefaultInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ImplementingBothInterface1 ob = new ImplementingBothInterface1();
		ob.print();

		ImplementingBothInterface2 ob1 = new ImplementingBothInterface2();
		ob1.print();

	}

}
