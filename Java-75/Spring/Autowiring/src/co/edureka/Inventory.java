package co.edureka;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.entity.Product;

public class Inventory {
	@Autowired
	private Product prod;

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
}
