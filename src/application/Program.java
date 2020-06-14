package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Playstation 4",2300.00));
		list.add(new Product("Smarthphone",1500.00));
		list.add(new Product("Notebook",1800.00));
					
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
