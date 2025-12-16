package program;

import structure.CompositeProduct;
import structure.LeafProduct;

public class Client {
	public static void main(String[] args) {
		LeafProduct p1 = new LeafProduct("Smartphone", 1500, 0.3);
		LeafProduct p2 = new LeafProduct("Headphone", 150, 0.1);
		LeafProduct p3 = new LeafProduct("Charger", 110, 0.2);
		LeafProduct p4 = new LeafProduct("Notebook", 3000, 0.8);
		
		CompositeProduct box = new CompositeProduct();
		box.add(p1);
		box.add(p2);
		box.add(p3);
		
		CompositeProduct box2 = new CompositeProduct();
		box2.add(p4);
		box2.add(box);
		
		System.out.println("Preço total: " + box2.getPrice());
		System.out.println("Peso total: " + box2.getWeight());
	}
}
