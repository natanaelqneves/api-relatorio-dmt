package digital.dmtran.api.domain.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoRelatorio (@NotNull Long id, LocalDate data, String turno, java.lang.String placa, Integer inicialKm, Integer finalKm, Integer radio, Integer cones){
}
