package functionalInterface;

/**
 * @author vagrant
 *
 */
public class FunctionalInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * if we are making use of functional Interface then we dont need to
		 * write the implementation each time we can make use of java 8 feature
		 * and can provide multiple implementation.
		 */

		FunctionalInterface impl1 = () -> System.out.println("Interface Impl 1.");
		impl1.print();

		FunctionalInterface impl2 = () -> System.out.println("Interface Impl 2.");
		impl2.print();
	}

}
