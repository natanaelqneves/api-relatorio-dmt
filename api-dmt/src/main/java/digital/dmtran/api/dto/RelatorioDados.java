package digital.dmtran.api.dto;

import digital.dmtran.api.domain.Turno;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record RelatorioDados(
        @NotBlank
        LocalDate data,
        @NotNull
        Turno turno,
        @NotBlank
        @Pattern(regexp = "\\d{7,8}")
        String matricula,
        @NotBlank
        @Pattern(regexp = "\\d{7}")
        String placa,
        @NotBlank
        Integer inicialKm,
        @NotBlank
        Integer finalKm,
        @NotBlank
        Integer radio,
        @NotBlank
        Integer cones) {
}
