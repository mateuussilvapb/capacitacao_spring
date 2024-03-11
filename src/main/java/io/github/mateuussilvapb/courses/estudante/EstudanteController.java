package io.github.mateuussilvapb.courses.estudante;

import io.github.mateuussilvapb.courses.configs.BaseController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/estudante")
public class EstudanteController implements BaseController<Estudante> {
    private final EstudanteService estudanteService;

    @Override
    @GetMapping
    public ResponseEntity<List<Estudante>> list() {
        return ResponseEntity.ok(estudanteService.getAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Estudante> getById(@PathVariable Long id) {
        return ResponseEntity.ok(estudanteService.getById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<Estudante> create(@RequestBody Estudante entity) {
        return ResponseEntity.ok(estudanteService.save(entity));
    }

    @Override
    @PatchMapping
    public ResponseEntity<Estudante> update(@RequestBody Estudante entity) {
        return ResponseEntity.ok(estudanteService.update(entity));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        estudanteService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
