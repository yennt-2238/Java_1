package Supermarket_manager;

import java.util.Date;
import java.util.Scanner;

public class foodsProduct extends product {
	private int mfg_year;
	private int mfg_month;
	private int mfg_date;
	private int exp_year;
	private int exp_month;
	private int exp_date;
	private String supplier;
	int current_year;
	int current_month;
	int current_date;

	public foodsProduct(int id, String nameProduct, int quantity_stock, double price, double vat, int mfg_year,
			int mfg_month, int mfg_date, int exp_year, int exp_month, int exp_date, String supplier) {
		this.ID=id;
		this.nameProduct= nameProduct;
		this.quantity_stock = quantity_stock;
		this.price= price;
		this.vat=vat;
		this.mfg_year = mfg_year;
		this.mfg_month = mfg_month;
		this.mfg_date = mfg_date;
		this.exp_year = exp_year;
		this.exp_month = exp_month;
		this.exp_date = exp_date;
		this.supplier = supplier;
	}

	public int getMfg_year() {
		return mfg_year;
	}

	public void setMfg_year(int mfg_year) {
		this.mfg_year = mfg_year;
	}

	public int getMfg_month() {
		return mfg_month;
	}

	public void setMfg_month(int mfg_month) {
		this.mfg_month = mfg_month;
	}

	public int getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(int mfg_date) {
		this.mfg_date = mfg_date;
	}

	public int getExp_year() {
		return exp_year;
	}

	public void setExp_year(int exp_year) {
		this.exp_year = exp_year;
	}

	public int getExp_month() {
		return exp_month;
	}

	public void setExp_month(int exp_month) {
		this.exp_month = exp_month;
	}

	public int getExp_date() {
		return exp_date;
	}

	public void setExp_date(int exp_date) {
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
		System.out.println("VAT của thực phẩm là:" + getPrice() * 0.05);

	}

//	public void checkValidDate() {
//		// TODO Auto-generated method stub
//		if (getMfg_date().compareTo(getExp_date()) <= 0) {
//			System.out.println("Valid date");
//			return;
//		}
//		System.out.println("Invalid data");
//	}
	public void input_current() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    System.out.print("Nhập năm hiện tại: ");
	    current_year =input.nextInt();
	    System.out.print("Nhập tháng hiện tại: ");
	    current_month =input.nextInt();
	    System.out.print("Nhập ngày hiện tại: ");
	    current_date =input.nextInt();

	}
	
	@Override
	public void Inventory_number() {
		// TODO Auto-generated method stub
//		Hàng thực phẩm: Nếu vẫn còn trong kho và bị hết hạn - đánh giá là khó bán

		if (getquantity_stock() > 0) {
			if (current_year > exp_year) {
				System.out.println("Khó bán");
				return;
			}
			if (current_year == exp_year) {
				if (current_month > exp_month) {
					System.out.println("Khó bán");
					return;
				}
				if (current_month == exp_month) {
					if (current_date - exp_date >= 10) {
						System.out.println("Khó bán");
						return;
					}
				}
			}
			if (current_year < exp_year) {
				System.out.println("vẫn còn hạn sử dụng");
				return;
			}

		}
		System.out.println("Không đánh giá");

	}
}
