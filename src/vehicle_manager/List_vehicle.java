package vehicle_manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

		for (int i = 0; i < vehiclelist.size(); i++) {
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

	public void Sort_Vehicle() {
		System.out.println(" Data sort là:");
		Collections.sort(vehiclelist, new Comparator<vehicle>() {
			@Override
			public int compare(vehicle v1, vehicle v2) {
				if (v1.getNumber() > v2.getNumber()) {
					return -1;
				} else if (v1.getNumber() < v2.getNumber()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}
}
