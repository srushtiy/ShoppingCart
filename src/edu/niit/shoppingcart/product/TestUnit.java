package edu.niit.shoppingcart.product;

import java.util.ArrayList;
import java.util.Iterator;

public class TestUnit {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();

		Product p = new Product("PRD01", "Toshiba Laptop", 10000);
		products.add(p);
		p = new Product("PRD02", "Macbook Pro", 50000);
		products.add(p);
		p = new Product("PRD03", "HP Pro", 20000);
		products.add(p);

		Iterator<Product> i = products.iterator();
		/*
		 * while(i.hasNext()) { Product pr=(Product)i.next();
		 * System.out.println(pr.getId()); System.out.println(pr.getName()); }
		 */

		for (Product s : products) {
			System.out.println(s.getId() + ' ' + s.getName() + ' ' + s.getPrice());
		}

		/*
		 * while (i.hasNext()) { Product p1 = (Product) i.next();
		 * System.out.println(pr.getId() + ' ' + pr.getName() + ' ' +
		 * pr.getPrice()); }
		 */

		while (i.hasNext()) {
			Product p1 = i.next();
			System.out.println(p1.getId() + ' ' + p1.getName() + ' ' + p1.getPrice());
		}

		l1.add(1);
		l1.add(2);
		l1.add(3);

		l2.add(4);
		l2.add(5);
		l2.add(6);

		l1.addAll(l2);

		for (Integer s : l1) {
			System.out.println(s.toString());
		}

		Iterator<Integer> it = l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
