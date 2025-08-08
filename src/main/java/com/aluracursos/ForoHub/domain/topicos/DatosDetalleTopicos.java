package com.aluracursos.ForoHub.domain.topicos;

import java.time.LocalDateTime;

public record DatosDetalleTopicos(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        String curso,
        LocalDateTime fechaCreacion
) {
    public DatosDetalleTopicos(Topicos topicos){
        this(
                topicos.getId(),
                topicos.getTitulo(),
                topicos.getMensaje(),
                topicos.getAutor(),
                topicos.getCurso(),
                topicos.getFechaCreacion()
        );
    }
}
