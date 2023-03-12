package Supermarket_manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		}
		productList pl = new productList();
		foodsProduct f = new foodsProduct(1, "foods1", 15, 15000, 5, 2012, 10, 10, 2025, 10, 10, "Yến C");
		pl.add_product_foods(f);
		pl.displays_Listfoods();
		f.VAT();
		f.input_current();
		f.Inventory_number();

	}

}
