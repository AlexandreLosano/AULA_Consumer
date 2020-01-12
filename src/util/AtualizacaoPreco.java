package util;

import java.util.function.Consumer;

import entidade.Produto;

public class AtualizacaoPreco implements Consumer<Produto>{

	@Override
	public void accept(Produto p) {
		p.setPrice(p.getPrice()*1.1);
	}
	
	

}
