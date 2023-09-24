package digital.dmtran.api.domain;

import digital.dmtran.api.dto.RelatorioDados;
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
    private Turno turno;
    private String matricula;
    private String placa;
    private Integer inicialKm;
    private Integer finalKm;
    private Integer radio;
    private Integer cones;
    public Relatorio(RelatorioDados relatorioDados) {
        this.data = relatorioDados.data();
        this.turno = relatorioDados.turno();
        this.matricula = relatorioDados.matricula();
        this.placa = relatorioDados.placa();
        this.inicialKm = relatorioDados.inicialKm();
        this.finalKm = relatorioDados.finalKm();
        this.radio = relatorioDados.radio();
        this.cones = relatorioDados.cones();
    }
}
