package methodInterfaceInJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author vagrant
 *
 */

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}

public class MethodInterfaceDemo {
	/*
	 * if we know that a particular interface is having just one methos . we can
	 * use this feature of java 8 and can directly have the implemtation
	 */

	public static void main(String[] args) {

		Employee e1 = new Employee("shashi", 23);
		Employee e2 = new Employee("Randhir", 20);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);

		/*
		 * java 7 approach
		 */
		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		empList.stream().forEach(ob -> {
			System.out.println(ob);
		});

		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getAge() > o2.getAge())
					return 1;
				if (o1.getAge() < o2.getAge())
					return -1;
				return 0;
			}
		});

		empList.stream().forEach(ob -> {
			System.out.println(ob);
		});
		/*
		 * java 8 approach
		 */

		Collections.sort(empList, (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));
	}

}
