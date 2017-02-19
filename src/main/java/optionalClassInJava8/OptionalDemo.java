package optionalClassInJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author vagrant
 *
 */
public class OptionalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("shashi");
		nameList.add("randhir");
		nameList.add("raj");
		nameList.add("java");

		String name = nameList.stream().findAny().orElse(null);
		System.out.println(name);

		Optional<String> value = Optional.ofNullable(null);
		System.out.println(value);
	}

}
