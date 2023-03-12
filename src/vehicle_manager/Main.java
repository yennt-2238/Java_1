package vehicle_manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(1, "Producer_0", "red", "yến owner_001", "yến c_001", "yen1@gmail.com", 12, "chạy bằng điện");
		Car c1 = new Car(2, "Producer_1", "white", "yến owner_002", "yến c_002", "yen2@gmail.com", 12, "chạy bằng xăng");
		Car c2 = new Car(3, "Producer_2", "blue", "yến owner_003", "yến c_003", "yen3@gmail.com", 12, "chạy bằng xăng");
		Car c3 = new Car(4, "Producer_3", "black", "yến owner_004", "yến c_004", "yen4@gmail.com", 12, "chạy bằng xăng");
		Car c4 = new Car(5, "Producer_4", "pink", "yến owner_005", "yến c_005", "yen5@gmail.com", 12, "chạy bằng điện");
		bike b1= new bike(6, "Producer_5", "pink1", "yến owner_006", "yến c_006", "yen6@gmail.com", "1200W");
		bike b2= new bike(7, "Producer_6", "pink2", "yến owner_007", "yến c_006", "yen6@gmail.com", "1300W");
		bike b3= new bike(8, "Producer_7", "pink3", "yến owner_008", "yến c_006", "yen6@gmail.com", "1500W");
		bike b4= new bike(9, "Producer_8", "pink4", "yến owner_009", "yến c_006", "yen6@gmail.com", "1800W");
		bike b5= new bike(10, "Producer_9", "pink5", "yến owner_010", "yến c_006", "yen6@gmail.com", "8200W");
		truck t1= new truck(11, "Producer_truck_1", "pink1", "yến owner_006", "yến_c_006", "yen6@gmail.com", "1 tạ");
		truck t2= new truck(12, "Producer_truck_2", "pink2", "yến owner_007", "yến_c_006", "yen6@gmail.com", "2 tấn");
		truck t3= new truck(13, "Producer_truck_3", "pink3", "yến owner_008", "yến c_006", "yen6@gmail.com", "100kg");
		truck t4= new truck(14, "Producer_truck_4", "pink4", "yến owner_009", "yến c_006", "yen6@gmail.com", "2 tạ");
		truck t5= new truck(15, "Producer_truck_5", "pink5", "yến owner_010", "yến c_006", "yen6@gmail.com", "9 tạ");
		List_vehicle  lc = new List_vehicle();
		lc.add_car(c);
		lc.add_car(c1);
		lc.add_car(c2);
		lc.add_car(c3);
		lc.add_car(c4);
		lc.add_bike(b1);
		lc.add_bike(b2);
		lc.add_bike(b3);
		lc.add_bike(b4);
		lc.add_bike(b5);
		lc.add_truck(t1);
		lc.add_truck(t2);
		lc.add_truck(t3);
		lc.add_truck(t4);
		lc.add_truck(t5);
		lc.displays_vehiclelist();
		lc.Search_vehicle_ID(2);
		lc.Search_vehicle_owner_ID("yến owner_006");
        lc.delete_vehicle("Producer_8");
        System.out.println("List sau khi delete");
		lc.displays_vehiclelist();

	}

}
