package Supermarket_manager;

import java.util.ArrayList;
import java.util.List;

public class productList extends product {
	private List<foodsProduct> productList1 = new ArrayList<>();
	private List<electricProduct> productList2 = new ArrayList<>();
	private List<crockeryProduct> productList3 = new ArrayList<>();

	@Override
	public void VAT() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Inventory_number() {
		// TODO Auto-generated method stub

	}

	public void add_product_foods(foodsProduct a) {
		// TODO Auto-generated method stub
		productList1.add(a);

	}

	public void add_product_electric(electricProduct b) {
		// TODO Auto-generated method stub
		productList2.add(b);

	}

	public void add_product_crockery(crockeryProduct c) {
		// TODO Auto-generated method stub
		productList3.add(c);

	}

	public void displays_Listfoods() {
		// TODO Auto-generated method stub
		for (foodsProduct i : productList1) {
//			int id, String nameProduct, int quantity_stock, double price, double vat, int mfg_year,
//			int mfg_month, int mfg_date, int exp_year, int exp_month, int exp_date, String supplier
			System.out.println("Thông tin sản phầm foods : "+ i.getID() + "-" + i.getNameProduct() + "-" + i.getquantity_stock() + "-" + i.getPrice()
					+ "-" + i.vat);

			System.out.println("Ngày sản xuất:"+i.getMfg_year() + "-" + i.getMfg_month() + "-" + i.getMfg_date());
			System.out.println("Ngày hết hạn:"+i.getExp_year() + "-" + i.getExp_month() + "-" + i.getExp_date());
			System.out.println("Nhà cung cấp: "+i.getSupplier());
		}
	}

	public void displays_Listelectric() {
		// TODO Auto-generated method stub
		for (electricProduct i : productList2) {
			System.out.println(i);
		}
	}

	public void displays_Listcrokery() {
		// TODO Auto-generated method stub
		for (crockeryProduct i : productList3) {
			System.out.println(i);
		}

	}

}
