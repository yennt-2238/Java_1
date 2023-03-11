package Supermarket_manager;

import java.util.Date;

public class foodsProduct extends product {
	private Date mfg_date;
	private Date exp_date;
	private String supplier;

	public foodsProduct(Date mfg_date, Date exp_date, String supplier) {
		super();
		this.mfg_date = mfg_date;
		this.exp_date = exp_date;
		this.supplier = supplier;
	}

	public Date getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(Date mfg_date) {
		this.mfg_date = mfg_date;
	}

	public Date getExp_date() {
		return exp_date;
	}

	public void setExp_date(Date exp_date) {
		this.exp_date = exp_date;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	@Override
	public void VAT() {
		// TODO Auto-generated method stub
		System.out.println(" VAT của thực phẩm là:" + getPrice() * 0.05);

	}

	public void checkValidDate() {
		// TODO Auto-generated method stub
		if (getMfg_date().compareTo(getExp_date()) <= 0) {
			System.out.println("Valid date");
			return;
		}
		System.out.println("Invalid data");
	}

	@Override
	public void Inventory_number() {
		// TODO Auto-generated method stub

		Date current_date = new Date();
		if (getquantity_stock() > 0 && current_date.compareTo(getExp_date()) > 0) {
			System.out.println("Khó bán");
			return;
		}
		System.out.println("Không đánh giá");

	}

	

}
