package Vehicle;

public class Main_1 {

	public Main_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tinh_thue xe_dap_1 = new xe_dap(1200);
		xe_dap_1.displays_infor();
		tinh_thue xe_may = new xe_may(200000);
		xe_may.displays_infor();
		tinh_thue xe_tai = new xe_tai(300000);
		xe_tai.displays_infor();
		tinh_thue xe_khach = new xe_khach(30000,10);
		xe_khach.displays_infor();


	}

}
