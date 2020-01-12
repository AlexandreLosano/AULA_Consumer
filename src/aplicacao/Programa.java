package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entidade.Produto;


public class Programa {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));

		Consumer<Produto> cons = p -> p.setPrice(p.getPrice()*1.1);
		
		list.forEach(cons);
		
		list.forEach(System.out::println);
	}

}
