package br.com.camilabazzo.myinvest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.camilabazzo.myinvest.domain.Investimento;
import br.com.camilabazzo.myinvest.repository.InvestimentoRepository;

@RestController
@RequestMapping("/investimentos")
@CrossOrigin(origins = "http://localhost:3000")
public class InvestimentoResource {
	// listar todos investimentos
	@Autowired
	private InvestimentoRepository investimentoRepository;

	@GetMapping
	public List<Investimento> listarTodos() {
		return investimentoRepository.findAll();
	}

	// buscando atraves do código
	@GetMapping("/{codigo}")
	public Investimento buscarPeloCodigo(@PathVariable Long codigo) {
		return investimentoRepository.findById(codigo).orElse(null);
	}

	// deletando atraves do código
	@DeleteMapping("/{codigo}")
	public void remover(@PathVariable Long codigo) {
		investimentoRepository.deleteById(codigo);
	}

	// cadastrar novo investimento com o seu conteudo
	@PostMapping
	public Investimento cadastrar(@RequestBody Investimento investimento) {
		return investimentoRepository.save(investimento);
	}
}
