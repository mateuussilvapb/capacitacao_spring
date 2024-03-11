package io.github.mateuussilvapb.courses;

import io.github.mateuussilvapb.courses.curso.Curso;
import io.github.mateuussilvapb.courses.curso.CursoRepository;
import io.github.mateuussilvapb.courses.estudante.Estudante;
import io.github.mateuussilvapb.courses.estudante.EstudanteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@Slf4j
@SpringBootApplication
public class CoursesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursesApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadDataBaseCursos(CursoRepository cursoRepository) {
        log.info("Loading data...");
        if (cursoRepository.count() > 0) {
            return (args) -> {
                log.info("Data already loaded in cursos table.");
            };
        }
        return (args) -> {
            Curso curso1 = new Curso();
            curso1.setTitulo("Ciência da Computação");
            curso1.setCreditos(5);
            Curso curso2 = new Curso();
            curso2.setTitulo("Análise e Desenvolvimento de Sistemas");
            curso2.setCreditos(5);
            Curso curso3 = new Curso();
            curso3.setTitulo("Engenharia de Software");
            curso3.setCreditos(5);
            Curso curso4 = new Curso();
            curso4.setTitulo("Matemática");
            curso4.setCreditos(5);
            Curso curso5 = new Curso();
            curso5.setTitulo("Física");
            curso5.setCreditos(5);
            cursoRepository.saveAll(List.of(curso1, curso2, curso3, curso4, curso5));
        };
    }

    @Bean
    public CommandLineRunner loadDataBaseEstudante(EstudanteRepository estudanteRepository) {
        log.info("Loading data...");
        if (estudanteRepository.count() > 0) {
            return (args) -> {
                log.info("Data already loaded in estudantes table.");
            };
        }
        return (args) -> {
            Estudante estudante1 = new Estudante();
            estudante1.setNome("João da Silva");
            estudante1.setDataMatricula(new Date());
            Estudante estudante2 = new Estudante();
            estudante2.setNome("Maria do Desterro");
            estudante2.setDataMatricula(new Date());
            Estudante estudante3 = new Estudante();
            estudante3.setNome("Marcos Dias");
            estudante3.setDataMatricula(new Date());
            Estudante estudante4 = new Estudante();
            estudante4.setNome("Vanuza Lucena");
            estudante4.setDataMatricula(new Date());
            Estudante estudante5 = new Estudante();
            estudante5.setNome("Miquéias de Souza");
            estudante5.setDataMatricula(new Date());
            estudanteRepository.saveAll(List.of(estudante1, estudante2, estudante3, estudante4, estudante5));
        };
    }

}
