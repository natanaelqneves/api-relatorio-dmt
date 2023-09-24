package digital.dmtran.api.domain;

import digital.dmtran.api.dto.PessoaDados;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matricula;

    @Enumerated(EnumType.STRING)
    private Funcao funcao;

    private String primeiroNome;

    private String segundoNome;

    @Enumerated(EnumType.STRING)
    private Turno turno;

    public Pessoa(PessoaDados dados) {
        this.matricula = dados.matricula();
        this.funcao = dados.funcao();
        this.primeiroNome = dados.primeiroNome();
        this.segundoNome = dados.segundoNome();
        this.turno = dados.turno();

    }
}
