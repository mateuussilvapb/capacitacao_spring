package io.github.mateuussilvapb.courses.curso;

import io.github.mateuussilvapb.courses.configs.BaseController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/curso")
public class CursoController implements BaseController<Curso> {
    private final CursoService cursoService;

    @Override
    @GetMapping
    public ResponseEntity<List<Curso>> list() {
        return ResponseEntity.ok(cursoService.getAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Curso> getById(@PathVariable Long id) {
        return ResponseEntity.ok(cursoService.getById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Curso> create(@RequestBody Curso entity) {
        return ResponseEntity.ok(cursoService.save(entity));
    }

    @Override
    @PatchMapping
    public ResponseEntity<Curso> update(@RequestBody Curso entity) {
        return ResponseEntity.ok(cursoService.update(entity));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cursoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
