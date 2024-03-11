package io.github.mateuussilvapb.courses.matricula;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatriculaService {
    private final MatriculaRepository matriculaRepository;

    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    public Matricula getById(Long id) {
        return matriculaRepository.findById(id).orElseThrow();
    }

    public Matricula save(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    public Matricula update(Matricula matricula) {
        return matriculaRepository.save(matricula);
    }

    public void delete(Long id) {
        Matricula matricula = getById(id);
        matriculaRepository.delete(matricula);
    }
}
