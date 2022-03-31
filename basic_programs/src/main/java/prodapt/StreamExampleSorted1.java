package prodapt;

import java.util.ArrayList;
import java.util.List;

public class StreamExampleSorted1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product1> productsList = new ArrayList<Product1>(); // Adding Products
		productsList.add(new Product1(1, "HP Laptop", 2f));
		productsList.add(new Product1(2, "Dell Laptop", 3f));
		productsList.add(new Product1(3, "Lenevo Laptop", 4f));
		productsList.add(new Product1(4, "Sony Laptop", 5f));
		productsList.add(new Product1(5, "Apple Laptop", 1f)); // This is more compact approach for filtering data

		Float totalPrice = productsList.stream().map(product -> product.price).reduce(100.0f,
				(sums, price) -> sums + price); // accumulating price
		System.out.println(totalPrice); // More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum);
		// accumulating price, by referring method of Float class
		System.out.println(totalPrice2);
	}

}
