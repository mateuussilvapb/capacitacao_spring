package io.github.mateuussilvapb.courses.curso;

import io.github.mateuussilvapb.courses.configs.BaseEntity;
import io.github.mateuussilvapb.courses.matricula.Matricula;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cursos")
public class Curso extends BaseEntity {

    private String titulo;
    private Integer creditos;
    @OneToMany(mappedBy = "curso")
    private List<Matricula> matriculas;
}
