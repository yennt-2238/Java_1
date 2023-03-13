package Supermarket_manager;

import java.util.ArrayList;
import java.util.List;

public class productList {
//	private List<foodsProduct> productList1 = new ArrayList<>();
//	private List<electricProduct> productList2 = new ArrayList<>();
//	private List<crockeryProduct> productList3 = new ArrayList<>();
	private List<product> Listproduct = new ArrayList<>();



	public void add_product_foods(foodsProduct a) {
		// TODO Auto-generated method stub
		Listproduct.add(a);

	}

	public void add_product_electric(electricProduct b) {
		// TODO Auto-generated method stub
		Listproduct.add(b);

	}

	public void add_product_crockery(crockeryProduct c) {
		// TODO Auto-generated method stub
		Listproduct.add(c);

	}

	public void displays_Listfoods() {
		// TODO Auto-generated method stub
		for (product i : Listproduct) {
			System.out.println("Thông tin sản phầm : "+ i.getID() + "-" + i.getNameProduct() + "-" + i.getquantity_stock() + "-" + i.getPrice()
					+ "-" + i.vat);

//			System.out.println("Ngày sản xuất:"+i.getMfg_year() + "-" + i.getMfg_month() + "-" + i.getMfg_date());
//			System.out.println("Ngày hết hạn:"+i.getExp_year() + "-" + i.getExp_month() + "-" + i.getExp_date());
//			System.out.println("Nhà cung cấp: "+i.getSupplier());
//		}
	}
	}
}

