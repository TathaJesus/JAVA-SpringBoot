package br.com.alunos.sistema_alunos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alunos.sistema_alunos.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    List <Aluno> findByNameContainingIgnoreCase(String name);
}
