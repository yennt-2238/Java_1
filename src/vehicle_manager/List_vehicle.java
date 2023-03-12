package vehicle_manager;

import java.util.ArrayList;
import java.util.List;

public class List_vehicle {
	List<Car> carlist = new ArrayList<>();
	List<bike> bikelist = new ArrayList<>();
	List<truck> trucklist = new ArrayList<>();

	public void add_car(Car car1) {
		carlist.add(car1);
	}

	public void add_bike(bike bike1) {
		bikelist.add(bike1);
	}

	public void add_truck(truck truck1) {
		trucklist.add(truck1);
	}
	public void delete_vehicle(String producer) {

		for (Car i : carlist) {
			if (i.getProducer() == producer) {
				carlist.remove(i);
				for (bike j : bikelist) {
					if (j.getProducer() == producer) {
						bikelist.remove(j);
						for (truck z : trucklist) {
							if (z.getProducer() == producer) {
								trucklist.remove(z);
							}
							System.out.println("ko tìm thấy");
						}
					}
				}
			}
		}
	}

	public void displays_vehiclelist() {
		System.out.println("List vehicle là: ");
		for (Car i : carlist) {
			System.out.println(
					i.getNumber() + " - " + i.getProducer() + " - " + i.getOwner_id() + " - " + i.getOwner_name()
							+ " - " + i.getOwner_email() + " - " + i.getNumber_seat() + " - " + i.getType_action());
		}
		for (bike j : bikelist) {
			System.out.println(j.getNumber() + " - " + j.getProducer() + " - " + j.getOwner_id() + " - "
					+ j.getOwner_name() + " - " + j.getOwner_email() + " - " + j.getWattage());
		}

		for (truck z : trucklist) {
			System.out.println(z.getNumber() + " - " + z.getProducer() + " - " + z.getOwner_id() + " - "
					+ z.getOwner_name() + " - " + z.getOwner_email() + " - " + z.gettonnage());
		}
	}

	public void Search_vehicle_ID(int ID) {
		System.out.println("Thông tin tìm kiêm vs ID= " + ID + " là:");
		for (Car i : carlist) {
			if (ID == i.getNumber()) {
				System.out.println(
						i.getNumber() + " - " + i.getProducer() + " - " + i.getOwner_id() + " - " + i.getOwner_name()
								+ " - " + i.getOwner_email() + " - " + i.getNumber_seat() + " - " + i.getType_action());
				return;
			}
		}
		for (bike j : bikelist) {
			if (ID == j.getNumber()) {
				System.out.println(j.getNumber() + " - " + j.getProducer() + " - " + j.getOwner_id() + " - "
						+ j.getOwner_name() + " - " + j.getOwner_email() + " - " + j.getWattage());
				return;

			}
		}
		for (truck z : trucklist) {
			if (ID == z.getNumber()) {
				System.out.println(z.getNumber() + " - " + z.getProducer() + " - " + z.getOwner_id() + " - "
						+ z.getOwner_name() + " - " + z.getOwner_email() + " - " + z.gettonnage());
				return;
			}
		}
	}

	public void Search_vehicle_owner_ID(String owner_id) {
		System.out.println("Thông tin tìm kiêm vs cmnd= " + owner_id + " là:");
		for (Car i : carlist) {
			if (owner_id == i.getOwner_id()) {
				System.out.println(
						i.getNumber() + " - " + i.getProducer() + " - " + i.getOwner_id() + " - " + i.getOwner_name()
								+ " - " + i.getOwner_email() + " - " + i.getNumber_seat() + " - " + i.getType_action());
				return;
			}
		}
		for (bike j : bikelist) {
			if (owner_id.equals(j.getOwner_id())) {
				System.out.println(j.getNumber() + " - " + j.getProducer() + " - " + j.getOwner_id() + " - "
						+ j.getOwner_name() + " - " + j.getOwner_email() + " - " + j.getWattage());
				return;

			}
		}
		for (truck z : trucklist) {
			if (owner_id.equals(z.getOwner_id())) {
				System.out.println(z.getNumber() + " - " + z.getProducer() + " - " + z.getOwner_id() + " - "
						+ z.getOwner_name() + " - " + z.getOwner_email() + " - " + z.gettonnage());
				return;
			}
		}
	}

}
