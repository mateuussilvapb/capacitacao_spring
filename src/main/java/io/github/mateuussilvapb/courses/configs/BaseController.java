package io.github.mateuussilvapb.courses.configs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseController<T> {

    @GetMapping("")
    public ResponseEntity<List<T>> list();

    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable Long id);

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity);

    @PatchMapping
    public ResponseEntity<T> update(@RequestBody T entity);

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id);
}
