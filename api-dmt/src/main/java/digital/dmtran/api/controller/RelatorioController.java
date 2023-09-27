package digital.dmtran.api.controller;

import digital.dmtran.api.domain.Relatorio;
import digital.dmtran.api.dto.DadosAtualizacaoRelatorio;
import digital.dmtran.api.dto.DadosDetalhadosRelatorio;
import digital.dmtran.api.dto.DadosListagemRelatorio;
import digital.dmtran.api.dto.DadosCadastroRelatorio;
import digital.dmtran.api.repository.RelatorioRepository;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarRelatorio(@RequestBody DadosCadastroRelatorio dados, UriComponentsBuilder uriBuilder){
        var relatorio = new Relatorio(dados);
        repository.save(relatorio);

        var uri = uriBuilder.path("/relatorio/{id}").buildAndExpand(relatorio.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhadosRelatorio(relatorio));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemRelatorio>> listarRelatoriosAtivos(@PageableDefault(size = 10, sort = {"data"}) Pageable paginacao){
        var page =  repository.findAllByAtivoTrue(paginacao).map(DadosListagemRelatorio::new);//caminho + ?size=1 (quantidade de itens) caminho + ?sort=parametro,(asc, desc)
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhaRelatorio(@PathVariable Long id){
        var relatorio = repository.getReferenceById(id);

        return ResponseEntity.ok(new DadosDetalhadosRelatorio(relatorio));
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizaRelatorio(@RequestBody @Valid DadosAtualizacaoRelatorio dados){
        var relatorio = repository.getReferenceById(dados.id());
        relatorio.AtualizaInformadoes(dados);
        return ResponseEntity.ok(new DadosDetalhadosRelatorio(relatorio));
    }

    //Exclusão lógica se faz necessário criar outra coluna na tabela contendo a informação de conta ativa ou inativa.

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity alteraEstado(@PathVariable Long id) {
        var relatorio = repository.getReferenceById(id);
        relatorio.excluiRelatorio();//Exclusão Lógica
        return ResponseEntity.noContent().build();
    }
}
