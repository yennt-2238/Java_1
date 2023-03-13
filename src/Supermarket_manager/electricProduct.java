package Supermarket_manager;

public class electricProduct extends product {
	private int warranty_Time;
	private double capacity;

	public electricProduct(int id, String nameProduct, int quantity_stock, double price, double vat,int warranty_Time, double capacity) {
		super(id, nameProduct, quantity_stock, price, vat);
		this.warranty_Time = warranty_Time;
		this.capacity = capacity;
	}

	public int getWarranty_Time() {
		return warranty_Time;
	}

	public void setWarranty_Time(int warranty_Time) {
		this.warranty_Time = warranty_Time;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public void VAT() {
		System.out.println(" VAT của eletric là:" + getPrice() * 0.1);

	}

	@Override
	public void Inventory_number() {
		// TODO Auto-generated method stub
//		Nếu số lượng tồn kho < 3 - đánh giá là bán được
		if (getquantity_stock() < 3) {
			System.out.println("Bán được");
			return;
		}
		System.out.println("Không đánh giá");

	}

	

}
