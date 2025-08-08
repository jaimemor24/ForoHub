package com.aluracursos.ForoHub.domain.topicos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicosRepository extends JpaRepository<Topicos, Long> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}
