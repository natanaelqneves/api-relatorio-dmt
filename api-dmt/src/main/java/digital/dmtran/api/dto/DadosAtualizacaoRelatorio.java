package digital.dmtran.api.dto;

import digital.dmtran.api.domain.Turno;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoRelatorio (@NotNull Long id, LocalDate data, Turno turno, String placa, Integer inicialKm, Integer finalKm, Integer radio, Integer cones){
}
