package com.aluracursos.ForoHub.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistrarTopicos(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotBlank String curso

) {
}
