package com.capgemini.delivery.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.delivery.dao.ProdutoDAO;
import com.capgemini.delivery.model.Batata;
import com.capgemini.delivery.model.Bebida;
import com.capgemini.delivery.model.Cliente;
import com.capgemini.delivery.model.Imagem;
import com.capgemini.delivery.model.Produto;
import com.capgemini.delivery.model.Stock;
import com.capgemini.delivery.model.StockDetail;
import com.capgemini.delivery.model.Tag;
import com.capgemini.delivery.model.Telefone;
import com.capgemini.delivery.model.Tipo;
import com.capgemini.delivery.repository.ClienteRepository;
import com.capgemini.delivery.repository.ImagensRepository;
import com.capgemini.delivery.repository.StockRepository;
import com.capgemini.delivery.repository.produtoRepository;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	private static ProdutoDAO dao = new ProdutoDAO();

	@Autowired
	private produtoRepository produtoRepository;

	@Autowired
	private ImagensRepository imagemRepository;

	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private ClienteRepository clienteRepository;

//	@RequestMapping(value = "/batatas", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Batata> buscarTodasBatatas() {
//		List<Batata> batatas = dao.buscarBatatas();
//		return batatas;
//	}
//
//	@RequestMapping(value = "bebidas", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Bebida> buscarBebidas() {
//		List<Bebida> bebidas = dao.buscarBebidas();
//		return bebidas;
//	}

//	@RequestMapping(value = "adicionais", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Produto> buscarTodosAdicionais() {
//		List<Produto> adicionais = dao.buscarTodosAdicionais();
//		return adicionais;
//	}

//	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
//	@ResponseBody
//	Produto atualizarProduto(@PathVariable int id, @RequestBody Produto produto) {
//		return produtoRepository.(id, produto);
//	}

//	@RequestMapping(value = "teste", method = RequestMethod.GET)
//	@ResponseBody
//	public String teste() {
//		Produto p = new Produto();
//		p.setTitulo("Produto novo");
//		
//		produtoRepository.save(p);
//		return "Sucesso-produto-salvo.";
//		
//	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	List<Produto> buscarTudo() {
		return (List<Produto>) produtoRepository.findAll();

	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody
	Optional<Produto> buscarUmProduto(@PathVariable long id) {
		return produtoRepository.findById(id);

	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	Produto inserirProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody
	String excluirBatata(@PathVariable long id) {
		produtoRepository.deleteById(id);
		return "Sucesso!";
	}

	@RequestMapping(value = "batatas", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodasBatatas() {
		List<Produto> list = produtoRepository.findByTipo(Tipo.BATATA);
		return list;
	}

	@RequestMapping(value = "bebidas", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodasBebidas() {
		List<Produto> list = produtoRepository.findByTipo(Tipo.BEBIDA);
		return list;
	}

	@RequestMapping(value = "adicionais", method = RequestMethod.GET)
	@ResponseBody
	public List<Produto> buscarTodasAdicionais() {
		List<Produto> list = produtoRepository.findByTipo(Tipo.ADICIONAL);
		return list;
	}

	@RequestMapping(value = "atualizar/{id}", method = RequestMethod.PUT)
	@ResponseBody
	Produto atualizarProduto(@RequestBody Produto produto, @PathVariable int id) {
		Optional<Produto> aux = buscarUmProduto(id);
		produto.setId(aux.get().getId());

		if (produto.getTitulo() == null) {
			produto.setTitulo(aux.get().getTitulo());
		}
		if (produto.getAdicionais() == null) {
			produto.setAdicionais(aux.get().getAdicionais());
		}
		if (produto.getIngredientes() == null) {
			produto.setAdicionais(aux.get().getIngredientes());
		}
		if (produto.getobservacao() == null) {
			produto.setAdicionais(aux.get().getAdicionais());
		}
		if (produto.getPreco() == 0) {
			produto.setPreco(aux.get().getPreco());
		}
		if (produto.getTipo() == null) {
			produto.setTipo(aux.get().getTipo());
		}

		return produtoRepository.save(produto);
	}

}