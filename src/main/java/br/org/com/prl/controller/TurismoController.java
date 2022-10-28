package br.org.com.prl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.org.com.prl.model.Cliente;
import br.org.com.prl.model.Destino;
import br.org.com.prl.model.Promocao;
import br.org.com.prl.repository.ClienteRepository;
import br.org.com.prl.repository.DestinoRepository;
import br.org.com.prl.repository.PromocaoRespository;

@Controller
@RequestMapping
public class TurismoController {

	// Rotas Menus
	@RequestMapping("/")
	public String Home() {
		return "index";
	}

	@RequestMapping("/Promocao")
	public String Promocao() {
		return "promocao";
	}

	@GetMapping("/Contato")
	public String Contato() {
		return "contato";
	}

	// Rotas Cadastros

	@RequestMapping("/Cliente")
	public String Cliente() {
		return "cliente";
	}

	@RequestMapping("/Destino")
	public String Destino() {
		return "destino";
	}

	@RequestMapping("/CadPromocao")
	public String CadPromocao() {
		return "cadpromocao";
	}

	// Metodo salvar cadastro cliente no banco
	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping(value = "/cadastrarCliente", method = RequestMethod.GET)
	public String formCliente() {
		return "Cliente";
	}

	@RequestMapping(value = "/cadastrarCliente", method = RequestMethod.POST)
	public String formCliente(Cliente cliente) {
		clienteRepository.save(cliente);

		return "redirect:/Cliente";
	}

	// Metodo salvar cadastro promocao no banco
	@Autowired
	private PromocaoRespository promocaoRepository;

	@RequestMapping(value = "/cadastrarPromocao", method = RequestMethod.GET)
	public String formPromocao() {
		return "CadPromocao";
	}

	@RequestMapping(value = "/cadastrarPromocao", method = RequestMethod.POST)
	public String formCliente(Promocao promocao) {
		promocaoRepository.save(promocao);

		return "redirect:/CadPromocao";
	}

	// Metodo salvar cadastro destino no banco
	@Autowired
	private DestinoRepository destinoRepository;
	
	@RequestMapping(value = "/cadastrarDestino", method = RequestMethod.GET)
	public String formDestino() {
		return "Destino";
	}
	
	@RequestMapping(value = "/cadastrarDestino", method = RequestMethod.POST)
	public String formCliente(Destino destino) {
		destinoRepository.save(destino);

		return "redirect:/Destino";
	}

	
	

}
