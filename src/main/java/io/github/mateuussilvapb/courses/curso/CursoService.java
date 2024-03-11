package io.github.mateuussilvapb.courses.curso;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {
    private final CursoRepository cursoRepository;

    public List<Curso> getAll() {
        return cursoRepository.findAll();
    }

    public Curso getById(Long id) {
        return cursoRepository.findById(id).orElseThrow();
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso update(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void delete(Long id) {
        Curso curso = getById(id);
        cursoRepository.delete(curso);
    }
}
