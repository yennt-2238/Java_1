package Animal;

public class Cat extends Animal {
	private String fur_color;
	private int height;

	public Cat(String name, int age, String type, String fur_color, int height) {
		super(name, age, type);
		this.fur_color = fur_color;
		this.height = height;
	}

	public void displays_cat() {
		System.out.println("==========================================");
		System.out.println("Thông tin Mèo:");
		System.out.println("Tên Dog :" + getName());
		System.out.println("Tuổi Dog:" + getAge());
		System.out.println("Thuộc loài" + getType());
		System.out.println("màu long mèo" + fur_color);
		System.out.println("Chiều cao mèo" + height);
	}
}