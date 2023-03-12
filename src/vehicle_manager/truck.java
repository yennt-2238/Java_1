package vehicle_manager;

public class truck extends vehicle {

	private String tonnage;

	public String gettonnage() {
		return tonnage;
	}

	public void settonnage(String tonnage) {
		this.tonnage = tonnage;
	}

	public truck(int number, String producer, String color, String owner_id, String owner_name, String owner_email,
			String wattage) {
		this.number = number;
		this.producer = producer;
		this.color = color;
		this.owner_id = owner_id;
		this.owner_name = owner_name;
		this.owner_email = owner_email;
		this.tonnage = tonnage;
	}

}
