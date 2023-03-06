package Animal;

public class Animal {
	protected String name;
	protected int age;
	protected String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Animal(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}

}