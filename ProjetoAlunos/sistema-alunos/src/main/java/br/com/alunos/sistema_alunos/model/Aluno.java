package br.com.alunos.sistema_alunos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome é obrigatório")
    private String name;
    @NotBlank(message = "O CPF do aluno é obrigatório")
    private String cpf;
    @NotBlank(message = "O aluno precisa estar em uma turma")
    private String turma;

    public Aluno() {
    }

    public Aluno(Long id, @NotBlank(message = "O nome é obrigatório") String name,
            @NotBlank(message = "O CPF do aluno é obrigatório") String cpf, 
            @NotNull(message = "O aluno precisa estar em uma turma") String turma)
    {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
