package br.unicamp.ic.inf335;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.unicamp.ic.inf335.beans.ProdutoBean;

public class Brecho {

	private static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	public static void main(String[] args) {		
		produtos.add(new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo."));
		produtos.add(new ProdutoBean("CD00002","Prod 2 ...", "Bla Bla Bla",1100.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00003","Prod 3 ...", "Bla Bla Bla",120.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00004","Prod 4 ...", "Bla Bla Bla",1300.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00005","Prod 5 ...", "Bla Bla Bla",9400.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00006","Prod 6 ...", "Bla Bla Bla",1500.0,"Bla Bla Bla"));
		
		// Imprime produtos
		produtos.stream().forEach(produto -> {	
			System.out.println("Codigo = " + produto.getCodigo() + " Nome = " + produto.getNome() + " Valor = " + produto.getValor());
		});
		
		// Ordena produtos
		Collections.sort(produtos, Comparator.comparing(ProdutoBean::getValor));
		
		// Imprime produtos ordenados
		System.out.println("-------------------- Produtos Ordenados -------------------");
		produtos.stream().forEach(produto -> {	
			System.out.println("Codigo = " + produto.getCodigo() + " Nome = " + produto.getNome() + " Valor = " + produto.getValor());
		});
		
		// Soma todos os valores dos produtos, calcula a media e a imprime
		System.out.println("Media de Valores = " + produtos.stream().mapToDouble(ProdutoBean::getValor).sum() / produtos.size());
	}

}
