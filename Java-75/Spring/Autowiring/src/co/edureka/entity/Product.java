package co.edureka.entity;

public class Product 
{
	private long prodId;
	private String prodName;
	private float prodPrice;

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
}
