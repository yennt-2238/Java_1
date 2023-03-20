package vehicle_manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c2 = new Car(20, "Honda", "red", "0012-2023-0315", "yến c_001", "yen1@gmail.com", 12, "chạy bằng điện");
		Car c = new Car(1, "Yamaha", "red", "0012-2023-0315", "yến c_001", "yen1@gmail.com", 12, "chạy bằng điện");
		Car c1 = new Car(2, "Toyota", "white", "0012-2023-0315", "yến c_002", "yen2@gmail.com", 12, "chạy bằng xăng");
		
		bike b1= new bike(6, "Honda", "pink1", "0012-2023-0315", "yến c_006", "yen6@gmail.com", "1200W");
		bike b2= new bike(9, "Yamaha", "pink2", "0012-2023-0315", "yến c_006", "yen6@gmail.com", "1300W");
		bike b3= new bike(10, "Producer_57", "pink3", "0012-2023-0315", "yến c_006", "yen6@gmail.com", "1500W");
		
		truck t3= new truck(13, "Yamaha", "pink3", "0012-2023-0315", "yến c_006", "yen6@gmail.com", "100kg");
		truck t4= new truck(14, "Producer_truck_4", "pink4", "0012-2023-0315", "yến c_006", "yen6@gmail.com", "2 tạ");
		truck t5= new truck(15, "Yamaha", "pink5", "0012-2023-0315", "yến c_006", "yen6@gmail.com", "9 tạ");
		
		List_vehicle  lc = new List_vehicle();
		lc.add_car(c2);
		lc.add_car(c);
		lc.add_car(c1);
		lc.add_bike(b1);
		lc.add_bike(b2);
		lc.add_bike(b3);
		lc.add_truck(t3);
		lc.add_truck(t4);
		lc.add_truck(t5);
		
		lc.displays_vehiclelist();
//		lc.Search_vehicle_ID(2);
//		lc.Search_vehicle_owner_ID("yến owner_006");
//		
//		System.out.println("size = " + lc.vehiclelist.size());
//        lc.delete_vehicle("Producer_5");
//        System.out.println("============List sau khi delete========");
//		System.out.println("size = " + lc.vehiclelist.size());
//		lc.displays_vehiclelist();
		System.out.println(" Sau khi sort là");
		lc.Sort_Vehicle();
		lc.displays_vehiclelist();


	}

}
