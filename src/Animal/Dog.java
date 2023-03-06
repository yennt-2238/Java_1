package Animal;

public class Dog extends Animal {
	private String color;
	private int weight;

	public Dog(String name, int age, String type, String color, int weight) {
		super(name, age, type);
		this.color = color;
		this.weight = weight;
	}

	public void displays_dog() {
		System.out.println("Thông tin dog:");
		System.out.println("Tên Dog :" + getName());
		System.out.println("Tuổi Dog:" + getAge());
		System.out.println("Thuộc loài: " + getType());
		System.out.println("màu chó: " + color);
		System.out.println("Cân nặng chó: " + weight);
	}
}