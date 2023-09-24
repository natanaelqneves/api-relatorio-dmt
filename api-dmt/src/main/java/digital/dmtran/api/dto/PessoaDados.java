package digital.dmtran.api.dto;

import digital.dmtran.api.domain.Funcao;
import digital.dmtran.api.domain.Turno;

public record PessoaDados(String matricula, Funcao funcao, String primeiroNome, String segundoNome, Turno turno ) {
}
