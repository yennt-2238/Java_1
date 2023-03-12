package vehicle_manager;

public class bike extends vehicle {

	private String wattage;

	public String getWattage() {
		return wattage;
	}

	public void setWattage(String wattage) {
		this.wattage = wattage;
	}

	public bike(int number, String producer, String color, String owner_id, String owner_name, String owner_email,
			String wattage) {
		this.number = number;
		this.producer = producer;
		this.color = color;
		this.owner_id = owner_id;
		this.owner_name = owner_name;
		this.owner_email = owner_email;
		this.wattage=wattage;
	}

}
