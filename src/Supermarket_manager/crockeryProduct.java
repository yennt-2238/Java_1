package Supermarket_manager;

import java.time.LocalDate;
import java.util.Date;

public class crockeryProduct extends product {
	String manufacturer;
	int warehouse_date;
	int warehouse_year;
	int warehouse_month;
	int current_year;
	int current_month;
	int current_date;

	public crockeryProduct(int id, String nameProduct, int quantity_stock, double price, double vat,String manufacturer, int warehouse_date, int warehouse_year, int warehouse_month,
			int current_year, int current_month, int current_date) {
		super(id, nameProduct, quantity_stock, price, vat);
		this.manufacturer = manufacturer;
		this.warehouse_date = warehouse_date;
		this.warehouse_year = warehouse_year;
		this.warehouse_month = warehouse_month;
		this.current_year = current_year;
		this.current_month = current_month;
		this.current_date = current_date;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getWarehouse_date() {
		return warehouse_date;
	}

	public void setWarehouse_date(int warehouse_date) {
		this.warehouse_date = warehouse_date;
	}

	public int getWarehouse_year() {
		return warehouse_year;
	}

	public void setWarehouse_year(int warehouse_year) {
		this.warehouse_year = warehouse_year;
	}

	public int getWarehouse_month() {
		return warehouse_month;
	}

	public void setWarehouse_month(int warehouse_month) {
		this.warehouse_month = warehouse_month;
	}

	public int getCurrent_year() {
		return current_year;
	}

	public void setCurrent_year(int current_year) {
		this.current_year = current_year;
	}

	public int getCurrent_month() {
		return current_month;
	}

	public void setCurrent_month(int current_month) {
		this.current_month = current_month;
	}

	public int getCurrent_date() {
		return current_date;
	}

	public void setCurrent_date(int current_date) {
		this.current_date = current_date;
	}

	@Override
	public void VAT() {
		System.out.println(" VAT của eletric là:" + getPrice() * 0.1);

	}

	@Override
	public void Inventory_number() {
		// TODO Auto-generated method stub
//		Nếu số lượng tồn kho > 50 và thời gian lưu kho > 10 ngày - đánh giá là bán chậm
//		Các trường hợp còn lại ko đánh giá
		LocalDate aa;
		if (current_year == warehouse_year && current_month == warehouse_month
				&& current_date - warehouse_date > 10 & getquantity_stock() > 50) {
			System.out.println(" đánh giá là bán chậm");
			return;
		}
		System.out.println("Không đánh giá");

	}

}
