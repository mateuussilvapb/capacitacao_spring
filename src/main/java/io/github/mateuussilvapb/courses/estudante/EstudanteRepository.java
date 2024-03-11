package io.github.mateuussilvapb.courses.estudante;

import io.github.mateuussilvapb.courses.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
