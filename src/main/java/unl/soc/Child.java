package unl.soc;

/**
 * A basic data class that models a child.
 * 
 */
public class Child {

	private String name;
	private Integer age;

	public Child(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public Integer getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return this.name + " (" + this.age + ")";
	}
}
