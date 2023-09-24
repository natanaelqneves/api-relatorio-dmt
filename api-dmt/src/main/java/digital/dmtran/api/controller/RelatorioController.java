package digital.dmtran.api.controller;

import digital.dmtran.api.domain.Relatorio;
import digital.dmtran.api.dto.RelatorioDados;
import digital.dmtran.api.repository.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioRepository repository;

    @PostMapping
    public void cadastrarRelatorio(@RequestBody RelatorioDados dados){
        repository.save(new Relatorio(dados));
    }
}
