package vehicle_manager;

import java.util.ArrayList;
import java.util.List;

public class List_vehicle {

	List<vehicle> vehiclelist = new ArrayList<>();

	public void add_car(Car car1) {
		vehiclelist.add(car1);
	}

	public void add_bike(bike bike1) {
		vehiclelist.add(bike1);
	}

	public void add_truck(truck truck1) {
		vehiclelist.add(truck1);
	}

	public void delete_vehicle(String producer) {
//		for (vehicle i : vehiclelist) {
//			if (i.getProducer() == producer) {
//				vehiclelist.remove(i);
//			}
//		}
		
		for(int i = 0; i < vehiclelist.size(); i++) {
			if (vehiclelist.get(i).getProducer() == producer) {
				vehiclelist.remove(i);
			}
		}
	}

	public void displays_vehiclelist() {
		System.out.println("List vehicle là: ");
		for (vehicle i : vehiclelist) {
			i.displayInfo();
		}
	}

	public void Search_vehicle_ID(int ID) {
		System.out.println("Thông tin tìm kiêm vs ID= " + ID + " là:");
		for (vehicle i : vehiclelist) {
			if (ID == i.getNumber()) {
				i.displayInfo();
			}
		}
	}

	public void Search_vehicle_owner_ID(String owner_id) {
		System.out.println("Thông tin tìm kiêm vs cmnd= " + owner_id + " là:");
		for (vehicle i : vehiclelist) {
			if (owner_id == i.getOwner_id()) {
				i.displayInfo();
			}
		}
	}
}
