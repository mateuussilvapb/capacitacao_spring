package io.github.mateuussilvapb.courses.estudante;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudanteService {
    private final EstudanteRepository estudanteRepository;

    public List<Estudante> getAll() {
        return estudanteRepository.findAll();
    }

    public Estudante getById(Long id) {
        return estudanteRepository.findById(id).orElseThrow();
    }

    public Estudante save(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public Estudante update(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public void delete(Long id) {
        Estudante estudante = getById(id);
        estudanteRepository.delete(estudante);
    }
}
