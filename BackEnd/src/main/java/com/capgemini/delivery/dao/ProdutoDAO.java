package com.capgemini.delivery.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.delivery.model.Batata;
import com.capgemini.delivery.model.Bebida;
import com.capgemini.delivery.model.Produto;

public class ProdutoDAO {

	List<Produto> produto1 = new ArrayList<Produto>();
//	ArrayList<Object> tudo = new ArrayList<Object>();
//	List<Batata> batatas = new ArrayList<Batata>();
//	List<Produto> adicionais = new ArrayList<Produto>();
//	List<Produto> ingredientes = new ArrayList<Produto>();
//	List<Bebida> bebidas = new ArrayList<Bebida>();

	public ProdutoDAO() {
		
	}

	public List<Produto> buscarTodos() {

		return produto1;
	}

//	public List<Produto> buscarTodosAdicionais() {
//		return adicionais;
//	}

//	public List<Batata> buscarBatatas() {
//		return batatas;
//	}
//
//	public List<Bebida> buscarBebidas() {
//		return bebidas;
//	}
//
//	public Batata buscarBatata(long id) {
//		for (Batata elemento : batatas) {
//			if (elemento.getId() == id) {
//				return elemento;
//			}
//		}
//		return null;
//	}

	

//	public Bebida buscarBebida(long id) {
//		for (Bebida elemento : bebidas) {
//			if (elemento.getId() == id) {
//				return elemento;
//			}
//		}
//		return null;
//	}

//	public boolean excluirProduto(long id) {
//		boolean encontrou = false;
//
//		for (Produto prod : produto1) {
//			if (prod.getId() == id) {
//				produto1.remove(prod);
//				encontrou = true;
//				break;
//			}
//		}
//
//		return encontrou;
//	}

//	void popularMassaDeTestes() {
		// POPULANDO LISTA DE ADICIONAIS
//		Produto adicional1 = new Produto();
//		adicional1.setTitulo("Bacon");
//
//		Produto adicional2 = new Produto();
//		adicional2.setTitulo("Ervilha");
//
//		Produto adicional3 = new Produto();
//		adicional3.setTitulo("Cheddar");
//
//		adicionais.add(adicional1);
//		adicionais.add(adicional2);
//		adicionais.add(adicional3);

//		// POPULANDO LISTA DE BEBIDAS
//		Bebida bebida1 = new Bebida();
//		bebida1.setTitulo("Coca");
//		bebida1.setId(1);
//
//		Bebida bebida2 = new Bebida();
//		bebida2.setTitulo("pepsi");
//		bebida1.setId(2);
//
//		Bebida bebida3 = new Bebida();
//		bebida3.setTitulo("Fanta");
//		bebida1.setId(3);
//
//		bebidas.add(bebida1);
//		bebidas.add(bebida2);
//		bebidas.add(bebida3);

		// POPULANDO LISTA DE INGREDIENTES
//		Produto ingrediente1 = new Produto();
//		ingrediente1.setTitulo("Ingrediente1");
//
//		Produto ingrediente2 = new Produto();
//		adicional2.setTitulo("Ingrediente2");
//
//		Produto ingrediente3 = new Produto();
//		adicional3.setTitulo("Ingrediente3");
//
//		ingredientes.add(ingrediente1);
//		ingredientes.add(ingrediente2);
//		ingredientes.add(ingrediente3);

//		// POPULANDO LISTA DE BATATAS
//		Batata batata1 = new Batata();
//		batata1.setTitulo("Batata1");
////		batata1.setAdicionais(adicionais);
//		batata1.setIngredientes(ingredientes);
//		batata1.setPreco(10.50);
//		batata1.setId(123);

//		Batata batata2 = new Batata();
//		batata2.setTitulo("Batata2");
////		batata2.setAdicionais(adicionais);
//		batata2.setIngredientes(ingredientes);
//		batata2.setPreco(15.50);
//		batata2.setId(456);
//
//		batatas.add(batata1);
//		batatas.add(batata2);
//
//		produto1.addAll(batatas);
//		produto1.addAll(adicionais);
//		produto1.addAll(bebidas);
//	}

//	public Produto atualizarProduto(int id, Produto produto) {
//		for (int contador = 0; contador < produto1.size(); contador++) {
//			if (produto1.get(contador).getId() == id) {
//				produto1.set(contador, produto);
//				break;
//			}
//		}
//
//		return produto;
//	}

//	public Produto inserirProduto(Produto produto) {
//		produto1.add(produto);
//		return produto;
//	}
}
