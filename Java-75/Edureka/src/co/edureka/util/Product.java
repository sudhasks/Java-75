package co.edureka.util;

public class Product {
	private long prod_id;
	private String prod_name;
	private int prod_qty;
	private float unit_price;

	public Product() {
	}

	public Product(long prod_id, String prod_name, int prod_qty, float unit_price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_qty = prod_qty;
		this.unit_price = unit_price;
	}

	public long getProd_id() {
		return prod_id;
	}

	public void setProd_id(long prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getProd_qty() {
		return prod_qty;
	}

	public void setProd_qty(int prod_qty) {
		this.prod_qty = prod_qty;
	}

	public float getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(float unit_price) {
		this.unit_price = unit_price;
	}

	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_qty=" + prod_qty + ", unit_price="
				+ unit_price + "]";
	}
	
	
}
