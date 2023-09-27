package digital.dmtran.api.domain;

import digital.dmtran.api.dto.DadosAtualizacaoRelatorio;
import digital.dmtran.api.dto.DadosCadastroRelatorio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "relatorios")
@Entity(name = "Relatorio")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Relatorio {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;
    private String turno;
    private String matricula;
    private String placa;
    private Integer inicialKm;
    private Integer finalKm;
    private Integer radio;
    private Integer cones;
    private boolean ativo;


    public Relatorio(DadosCadastroRelatorio relatorioDados) {
        this.data = relatorioDados.data();
        this.turno = relatorioDados.turno();
        this.matricula = relatorioDados.matricula();
        this.placa = relatorioDados.placa();
        this.inicialKm = relatorioDados.inicialKm();
        this.finalKm = relatorioDados.finalKm();
        this.radio = relatorioDados.radio();
        this.cones = relatorioDados.cones();
        this.ativo = true;

    }

    public Long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTurno() {
        return turno;
    }

    public java.lang.String getMatricula() {
        return matricula;
    }

    public java.lang.String getPlaca() {
        return placa;
    }

    public Integer getInicialKm() {
        return inicialKm;
    }

    public Integer getFinalKm() {
        return finalKm;
    }

    public Integer getRadio() {
        return radio;
    }

    public Integer getCones() {
        return cones;
    }

    public void AtualizaInformadoes(DadosAtualizacaoRelatorio dados) {
        if(dados.data() != null){
            this.data = dados.data();
        }
        if(dados.turno() != null){
            this.turno = dados.turno();
        }
        if(dados.placa() != null){
            this.placa = dados.placa();
        }
        if(dados.inicialKm() != null){
            this.inicialKm = dados.inicialKm();
        }
        if(dados.finalKm() != null){
            this.finalKm = dados.finalKm();
        }
        if(dados.radio() != null){
            this.radio = dados.radio();
        }
        if(dados.cones() != null){
            this.cones = dados.cones();
        }

    }


    public void excluiRelatorio() {
        this.ativo = false;
    }
}
