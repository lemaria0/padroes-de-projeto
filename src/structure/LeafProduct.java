package structure;

public class LeafProduct extends ComponentProduct {
	
	private String name;
	private double price, weight;
	
	public LeafProduct(String name, double price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	
}
