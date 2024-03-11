package io.github.mateuussilvapb.courses.matricula;

import io.github.mateuussilvapb.courses.configs.BaseEntity;
import io.github.mateuussilvapb.courses.curso.Curso;
import io.github.mateuussilvapb.courses.estudante.Estudante;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "matriculas")
public class Matricula extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;
}
