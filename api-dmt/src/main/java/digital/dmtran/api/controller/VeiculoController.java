package digital.dmtran.api.controller;

import digital.dmtran.api.domain.Veiculo;
import digital.dmtran.api.dto.VeiculoDados;
import digital.dmtran.api.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;
    @PostMapping
    public void cadastrarVeiculo(@RequestBody VeiculoDados dados) {
        repository.save(new Veiculo(dados));
    }
}
