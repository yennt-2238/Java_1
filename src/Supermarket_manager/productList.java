package Supermarket_manager;

import java.util.ArrayList;
import java.util.List;

import Student_management.student_infor;

public class productList extends product {
	private List<product> productList1 = new ArrayList<>();

	@Override
	public void VAT() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Inventory_number() {
		// TODO Auto-generated method stub

	}

	public void add_product(product a) {
		// TODO Auto-generated method stub
		productList1.add(a);

	}

	public void add_product_foods() {
		// TODO Auto-generated method stub
		foodsProduct foods = new foodsProduct(null, null, nameProduct);

	}

}
