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
			String tonnage) {
		super(number, producer, color, owner_id, owner_name, owner_email);
		this.tonnage = tonnage;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("tonnage: " + tonnage);
		System.out.println("==================");

	}
}
