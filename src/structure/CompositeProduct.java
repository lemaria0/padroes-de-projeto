package structure;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends ComponentProduct {

	private List<ComponentProduct> children = new ArrayList<>();
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return children.stream().mapToDouble(ComponentProduct::getPrice).sum();
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return children.stream().mapToDouble(ComponentProduct::getWeight).sum();
	}

	public void add(ComponentProduct p) {
		children.add(p);
	}

	public void remove(ComponentProduct p) {
		children.remove(p);
	}

}
