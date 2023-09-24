package digital.dmtran.api.dto;

import digital.dmtran.api.domain.Turno;

import java.time.LocalDate;

public record RelatorioDados(LocalDate data, Turno turno, String matricula, String placa, Integer inicialKm, Integer finalKm, Integer radio, Integer cones) {
}
