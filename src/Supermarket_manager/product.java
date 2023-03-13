package Supermarket_manager;

public abstract class product {
	protected int ID;
	protected String nameProduct;
	protected int quantity_stock;
	protected double price;
	protected double vat;

	public abstract void VAT();

	public abstract void Inventory_number();



	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getquantity_stock() {
		return quantity_stock;
	}

	public void setquantity_stock(int iquantity_stockr) {
		this.quantity_stock = quantity_stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public product(int iD, String nameProduct, int quantity_stock, double price, double vat) {
		ID = iD;
		this.nameProduct = nameProduct;
		this.quantity_stock = quantity_stock;
		this.price = price;
		this.vat = vat;
		System.out.println("Vao day");
	}
//	
//	
//	public product() {
//	}
//	
	
	

}
