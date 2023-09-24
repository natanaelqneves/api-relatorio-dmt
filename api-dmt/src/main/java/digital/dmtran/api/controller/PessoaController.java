package digital.dmtran.api.controller;

import digital.dmtran.api.domain.Pessoa;
import digital.dmtran.api.dto.PessoaDados;
import digital.dmtran.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public void cadastrarPessoa(@RequestBody PessoaDados dados){
        repository.save(new Pessoa(dados));
    }
}
