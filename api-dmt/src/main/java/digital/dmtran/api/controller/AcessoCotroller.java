package digital.dmtran.api.controller;

import digital.dmtran.api.domain.Pessoa;
import digital.dmtran.api.dto.LoginDados;
import digital.dmtran.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AcessoCotroller {

    private Pessoa pessoaLogada;
    @Autowired
    private PessoaRepository repository;

    @PostMapping("/login")
    public void efetuaLogin(@RequestBody LoginDados dados){
        pessoaLogada = repository.getReferenceByNomeDeUsuario(dados.nomeDeUsuario());
    }
}
