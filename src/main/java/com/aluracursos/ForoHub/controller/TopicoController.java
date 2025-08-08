package com.aluracursos.ForoHub.controller;



import com.aluracursos.ForoHub.domain.topicos.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicosRepository topicosRepository;

    @Transactional
    @PostMapping
    public ResponseEntity registrarTopicos (@RequestBody @Valid DatosRegistrarTopicos datos, UriComponentsBuilder uriComponentsBuilder){
        if (topicosRepository.existsByTituloAndMensaje(datos.titulo(), datos.mensaje())) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Ya existe un tópico con el mismo título y mensaje.");
        }
        var topicos = new Topicos(datos);
        topicosRepository.save(topicos);
        var uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topicos.getId()).toUri();
        return ResponseEntity.created(uri).body(new DatosDetalleTopicos(topicos));
    }

    @GetMapping
    public ResponseEntity<Page<DatosListarTopicos>> listar(@PageableDefault(size=10, sort={"fechaCreacion"},direction = Sort.Direction.DESC) Pageable paginacion){
        var page = topicosRepository.findAll(paginacion)
                .map(DatosListarTopicos::new);
        return ResponseEntity.ok(page);
    }

    @Transactional
    @PutMapping
    public ResponseEntity actualizarTopicos(@RequestBody @Valid DatosActualizarTopicos datos){
        var optionalTopicos = topicosRepository.findById(datos.id());

        if (optionalTopicos.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontró el tópico con ID " + datos.id());
        }

        var topicos = optionalTopicos.get();
        topicos.actualizarInformacion(datos);
        return ResponseEntity.ok(new DatosDetalleTopicos(topicos));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity eliminarTopicos(@PathVariable Long id) {
        var optionalTopico = topicosRepository.findById(id);

        if (optionalTopico.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontró el tópico con ID " + id);
        }
        topicosRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity detallarTopicos(@PathVariable Long id){
        var topicos = topicosRepository.getReferenceById(id);
        return ResponseEntity.ok(new DatosDetalleTopicos(topicos));
    }

}
