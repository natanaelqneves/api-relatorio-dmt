package digital.dmtran.api.dto;

import digital.dmtran.api.domain.Relatorio;
import digital.dmtran.api.domain.Turno;


import java.time.LocalDate;

public record DadosListagemRelatorio (Long id, LocalDate data, Turno turno, String placa, Integer inicialKm, Integer finalKm, Integer radio, Integer cones) {

    public DadosListagemRelatorio(Relatorio relatorio) {
        this(relatorio.getId(), relatorio.getData(), relatorio.getTurno(), relatorio.getPlaca(), relatorio.getInicialKm(), relatorio.getFinalKm(), relatorio.getRadio(), relatorio.getCones());
    }
}
