package Vehicle;

public class xe_khach implements tinh_thue {
	private double amount;
	private int number_per;


	public xe_khach(double amount, int number_per) {

		this.amount = amount;
		this.number_per = number_per;
	}

	@Override
	public double set_tax() {
		// TODO Auto-generated method stub
		if(number_per<5) {
		return (Math.round(amount*0.8));
	}
		return(Math.round(amount*0.6));
}

	@Override
	public void displays_infor() {
		// TODO Auto-generated method stub
		System.out.println(" Tax của xe khach là: "+set_tax());
		
	}

	
}
