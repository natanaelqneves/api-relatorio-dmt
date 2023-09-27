package digital.dmtran.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record DadosCadastroRelatorio(
        @NotBlank
        LocalDate data,
        @NotNull
        String turno,
        @NotBlank
        @Pattern(regexp = "\\d{7,8}")
        java.lang.String matricula,
        @NotBlank
        @Pattern(regexp = "\\d{7}")
        java.lang.String placa,
        @NotBlank
        Integer inicialKm,
        @NotBlank
        Integer finalKm,
        @NotBlank
        Integer radio,
        @NotBlank
        Integer cones) {
}
