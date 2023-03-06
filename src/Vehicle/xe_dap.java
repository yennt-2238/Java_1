package Vehicle;

public class xe_dap implements tinh_thue {
	private double amount;

	public xe_dap(double amount) {

		this.amount = amount;
	}

	@Override
	public double set_tax() {
		// TODO Auto-generated method stub
		return (amount*0);
	}

	@Override
	public void displays_infor() {
		// TODO Auto-generated method stub
		System.out.println(" Tax của xe đạp là: "+set_tax());
		
	}

}
