package med.voll.api.domain.paciente.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.domain.direccion.DatosDireccion;


public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,

        @NotBlank
        @Size(min = 0, max = 15)
        String telefono,

        @Pattern(regexp = "\\d{2}\\.\\d{3}\\.\\d{3}")//DIGITO DE 2 Y . DIGITO DE 3 Y . DIGITO DE 3
        @NotBlank
        String documento,

        @NotNull @Valid DatosDireccion direccion) {
}
