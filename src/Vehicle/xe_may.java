package Vehicle;

public class xe_may implements tinh_thue {
	private double amount;

	public xe_may(double amount) {

		this.amount = amount;
	}

	@Override
	public double set_tax() {
		// TODO Auto-generated method stub
		return (Math.round(amount*0.15));
	}

	@Override
	public void displays_infor() {
		// TODO Auto-generated method stub
		System.out.println(" Tax của xe máy là: "+set_tax());
		
	}

}
