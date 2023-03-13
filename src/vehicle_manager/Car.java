package vehicle_manager;

public class Car extends vehicle {
	private int number_seat;
	private String type_action;

	public int getNumber_seat() {
		return number_seat;
	}

	public void setNumber_seat(int number_seat) {
		this.number_seat = number_seat;
	}

	public String getType_action() {
		return type_action;
	}

	public void setType_action(String type_action) {
		this.type_action = type_action;
	}

	public Car(int number, String producer, String color, String owner_id, String owner_name, String owner_email,
			int number_seat, String type_action) {
		super(number, producer, color, owner_id, owner_name, owner_email);
		this.number_seat = number_seat;
		this.type_action = type_action;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("number of seat: " + number_seat);
		System.out.println("==================");
	}
	

}
