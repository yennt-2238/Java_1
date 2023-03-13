package vehicle_manager;

public abstract class vehicle {
	protected int number;
	protected  String producer;
	protected  String color;
	protected  String owner_id;
	protected  String owner_name;
	protected  String owner_email;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getOwner_email() {
		return owner_email;
	}

	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}

	public vehicle(int number, String producer, String color, String owner_id, String owner_name, String owner_email) {
		this.number = number;
		this.producer = producer;
		this.color = color;
		this.owner_id = owner_id;
		this.owner_name = owner_name;
		this.owner_email = owner_email;
	}
	public void displayInfo() {
		System.out.println("Biển số xe:" +number);
		System.out.println("Nhà sản xuất:" +producer);
		System.out.println("Màu sắc của xe: "+color);
		System.out.println("CMND của chủ xe : "+owner_id);
		System.out.println("Tên của chủ xe : "+ owner_name);
		System.out.println("Mail của chủ xe : "+owner_email );

	}

}
