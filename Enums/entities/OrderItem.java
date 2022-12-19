package entities;

public class OrderItem extends Product{
	private Integer quantity;
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getSubTotal() {
		return this.quantity * getPrice();
	}
}
