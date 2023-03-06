package Shape;

public class Detange implements shape{

	private int canh_1;
	private int canh_2;
	
	public int getCanh_1() {
		return canh_1;
	}

	public void setCanh_1(int canh_1) {
		this.canh_1 = canh_1;
	}

	public int getCanh_2() {
		return canh_2;
	}

	public void setCanh_2(int canh_2) {
		this.canh_2 = canh_2;
	}

	public Detange(int canh_1, int canh_2) {
		this.canh_1 = canh_1;
		this.canh_2 = canh_2;
	}

	@Override
	public void getdraw() {
		System.out.println("Please draw hình chữ nhật");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (canh_1*canh_2);
	}

	@Override
	public void displays_infor() {
		System.out.println("Diện tích hình chữ nhật: "+getArea());
		
	}

}
