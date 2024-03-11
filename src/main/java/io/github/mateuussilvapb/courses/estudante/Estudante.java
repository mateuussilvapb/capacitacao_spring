package io.github.mateuussilvapb.courses.estudante;

import io.github.mateuussilvapb.courses.configs.BaseEntity;
import io.github.mateuussilvapb.courses.matricula.Matricula;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "estudantes")
public class Estudante extends BaseEntity {

    private String nome;
    private Date dataMatricula;
    @OneToMany(mappedBy = "estudante")
    private List<Matricula> matriculas;
}
