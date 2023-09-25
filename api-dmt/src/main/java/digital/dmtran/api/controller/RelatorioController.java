package digital.dmtran.api.controller;

import digital.dmtran.api.domain.Relatorio;
import digital.dmtran.api.dto.DadosAtualizacaoRelatorio;
import digital.dmtran.api.dto.DadosListagemRelatorio;
import digital.dmtran.api.dto.RelatorioDados;
import digital.dmtran.api.repository.RelatorioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarRelatorio(@RequestBody @Valid RelatorioDados dados){
        repository.save(new Relatorio(dados));
    }
    /*
    @GetMapping
    public Page<DadosListagemRelatorio> listarRelatorios(@PageableDefault(size = 10, sort = {"data"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemRelatorio::new);//caminho + ?size=1 (quantidade de itens) caminho + ?sort=parametro,(asc, desc)
    }
    */

    @GetMapping
    public Page<DadosListagemRelatorio> listarRelatoriosAtivos(@PageableDefault(size = 10, sort = {"data"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemRelatorio::new);//caminho + ?size=1 (quantidade de itens) caminho + ?sort=parametro,(asc, desc)
    }

    @PutMapping
    @Transactional
    public void atualizaRelatorio(@RequestBody @Valid DadosAtualizacaoRelatorio dados){
        var relatorio = repository.getReferenceById(dados.id());
        relatorio.AtualizaInformadoes(dados);
    }
    /*
    @DeleteMapping("/{id}")
    @Transactional
    public void deletaRelatorio(@PathVariable Long id){
        repository.deleteById(id);
    }
    */
    //Exclusão lógica se faz necessário criar outra coluna na tabela contendo a informação de conta ativa ou inativa.

    @DeleteMapping("/{id}")
    @Transactional
    public void alteraEstado(@PathVariable Long id){
        var relatorio = repository.getReferenceById(id);
        relatorio.excluiRelatorio();//Exclusão Lógica
    }
}
