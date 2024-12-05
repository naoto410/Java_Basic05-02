package mypackage;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> items;
	private static final int MAX_ITEMS = 3;

	public ShoppingCart() {
		items = new ArrayList<>();
	}

	public void addItem(Product product) {
		if (items.size() < MAX_ITEMS) {
			items.add(product);
	    } else {
	    	System.out.println("カートがいっぱいです。商品を追加できません。");
	    }
	}

	public double getTotalPrice() {
		double total = 0.0;
	    for (Product product : items) {
	    	total += product.getPrice();
	    }

	    return total;
	}
}