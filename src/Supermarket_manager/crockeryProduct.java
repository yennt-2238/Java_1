package Supermarket_manager;

import java.util.Date;

public class crockeryProduct extends product {
	private String manufacturer;
	private Date warehouse_date;

	public crockeryProduct(String manufacturer, Date warehouse_date) {
		super();
		this.manufacturer = manufacturer;
		this.warehouse_date = warehouse_date;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getWarehouse_date() {
		return warehouse_date;
	}

	public void setWarehouse_date(Date warehouse_date) {
		this.warehouse_date = warehouse_date;
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

		Date current_date = new Date();
		
		long distance = current_date.getTime() - getWarehouse_date().getTime();
        long diff= (distance / 1000 / 60 / 60 / 24);
		if (getquantity_stock() > 50 && diff>10) {
			System.out.println(" đánh giá là bán chậm");
			return;
		}
		System.out.println("Không đánh giá");

	}

	
}
