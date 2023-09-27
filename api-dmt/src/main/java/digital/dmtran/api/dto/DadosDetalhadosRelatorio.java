package digital.dmtran.api.dto;

import digital.dmtran.api.domain.Relatorio;

import java.time.LocalDate;

public record DadosDetalhadosRelatorio(Long id, LocalDate data, String turno, java.lang.String matricula, java.lang.String placa, Integer inicialKm, Integer finalKm, Integer radio, Integer cones, boolean ativo) {

    public DadosDetalhadosRelatorio(Relatorio relatorio){
        this(relatorio.getId(), relatorio.getData(), relatorio.getTurno(), relatorio.getMatricula(), relatorio.getPlaca(), relatorio.getInicialKm(), relatorio.getFinalKm(), relatorio.getRadio(), relatorio.getCones(), relatorio.isAtivo());
    }

}
