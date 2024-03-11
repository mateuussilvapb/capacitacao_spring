package io.github.mateuussilvapb.courses.matricula;

import io.github.mateuussilvapb.courses.estudante.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
