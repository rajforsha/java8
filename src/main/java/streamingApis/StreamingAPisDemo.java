package streamingApis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vagrant
 *
 */
public class StreamingAPisDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("shashi");
		nameList.add("randhir");
		nameList.add("raj");
		nameList.add("java");

		nameList.stream().forEach(System.out::println);
		List<String> newList = nameList.stream().filter(name -> name.startsWith("r")).collect(Collectors.toList());
		newList.stream().forEach(System.out::println);
		nameList = nameList.stream().map(name -> name = "trn:uuid:uid:" + name).collect(Collectors.toList());
		nameList.stream().forEach(System.out::println);
	}

}
