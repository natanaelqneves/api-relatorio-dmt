package digital.dmtran.api.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDate;
public record DadosCadastroRelatorio(
        @NotBlank
        LocalDate data,
        @NotBlank
        String turno,
        @NotBlank
        @Pattern(regexp = "\\d{7,8}")
        String matricula,
        @NotBlank
        @Pattern(regexp = "\\d{7}")
        String placa,
        @NotNull
        Integer inicialKm,
        @NotNull
        Integer finalKm,
        @NotNull
        Integer radio,
        @NotNull
        Integer cones) {
}
