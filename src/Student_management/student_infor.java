package Student_management;

public class student_infor {
	private String name;
	private int age;
	private String address;

	public student_infor(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
//	public void displays_infor_hocsinh() {
//		System.out.println(" Thông tin học sinh: ");
//		System.out.println(getName());
//		System.out.println(getAge());
//		System.out.println(getAddress());
//		}

}
