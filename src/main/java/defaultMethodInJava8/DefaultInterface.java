package defaultMethodInJava8;

/**
 * @author vagrant
 *
 */
public interface DefaultInterface {

	/*
	 * we can define a default method in interface provided by java 8. we can
	 * have one static implementation as well.
	 */

	default void print() {
		System.out.println("This method is invoked because of default implemenataion in interface.");
	}

	static void display() {
		System.out.println("this is a static block defined in interface.");
	}

	static void multipleStaticBlocks() {
		System.out.println("we can have multiple static blocks in interface . its a feature of java 8");
	}
}
