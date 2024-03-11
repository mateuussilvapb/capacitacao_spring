package io.github.mateuussilvapb.courses.matricula;

import io.github.mateuussilvapb.courses.configs.BaseController;
import io.github.mateuussilvapb.courses.matricula.Matricula;
import io.github.mateuussilvapb.courses.matricula.MatriculaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/matricula")
public class MatriculaController implements BaseController<Matricula> {
    private final MatriculaService matriculaService;

    @Override
    @GetMapping
    public ResponseEntity<List<Matricula>> list() {
        return ResponseEntity.ok(matriculaService.getAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Matricula> getById(@PathVariable Long id) {
        return ResponseEntity.ok(matriculaService.getById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Matricula> create(@RequestBody Matricula entity) {
        return ResponseEntity.ok(matriculaService.save(entity));
    }

    @Override
    @PatchMapping
    public ResponseEntity<Matricula> update(@RequestBody Matricula entity) {
        return ResponseEntity.ok(matriculaService.update(entity));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        matriculaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
