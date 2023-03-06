package Vehicle;

public class xe_tai implements tinh_thue{

	private double amount;

	public xe_tai(double amount) {

		this.amount = amount;
	}

	@Override
	public double set_tax() {
		// TODO Auto-generated method stub
		return (Math.round(amount*0.13));
	}

	@Override
	public void displays_infor() {
		// TODO Auto-generated method stub
		System.out.println(" Tax của xe tai là: "+set_tax());
		
	}

}
