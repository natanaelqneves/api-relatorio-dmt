package digital.dmtran.api.domain;

import digital.dmtran.api.dto.VeiculoDados;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "veiculos")
@Entity(name = "Veiculo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private String modelo;
    private Integer totalKm;
    private Integer radio;
    private Integer cones;

    public Veiculo(VeiculoDados dados) {
        this.placa = dados.placa();
        this.modelo = dados.modelo();
        this.totalKm = dados.totalKm();
        this.radio = dados.radio();
        this.cones = dados.cones();
    }
}
