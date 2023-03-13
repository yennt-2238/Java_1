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
		super(number, producer, color, owner_id, owner_name, owner_email);
		this.wattage = wattage;
	}


	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("wattage: " + wattage);
		System.out.println("==================");

	}

}
