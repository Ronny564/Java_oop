package searchingSorting;

public class Item {
	String ItemName;
	double Price;
	int quantity;

	public Item(String itemName, double price, int quantity) {
//		super();
		ItemName = itemName;
		Price = price;
		this.quantity = quantity;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
