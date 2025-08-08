package com.aluracursos.ForoHub.domain.topicos;

import java.time.LocalDateTime;

public record DatosListarTopicos(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        String curso,
        LocalDateTime fechaCreacion
) {
    public DatosListarTopicos(Topicos topicos) {
        this(topicos.getId(),topicos.getTitulo(), topicos.getMensaje(),topicos.getAutor(),topicos.getCurso(),topicos.getFechaCreacion());
    }
}
