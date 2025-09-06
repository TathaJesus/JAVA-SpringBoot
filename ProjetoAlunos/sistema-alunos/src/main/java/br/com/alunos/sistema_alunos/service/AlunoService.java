package br.com.alunos.sistema_alunos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alunos.sistema_alunos.model.Aluno;
import br.com.alunos.sistema_alunos.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> listAll() {
        return alunoRepository.findAll();

    }

    public Aluno findAluno(Long id) {
        Optional<Aluno> aluno = alunoRepository.findById(id);
        if (aluno.isPresent())
            return aluno.get();
        throw new RuntimeException("Aluno não encontrado!");
    }

    public Aluno createAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deleteAluno(Long id) {
        if (!alunoRepository.existsById(id))
            throw new RuntimeException("Erro ao excluir aluno!");
        alunoRepository.deleteById(id);
    }

    public List<Aluno> findByName(String name){
        return alunoRepository.findByNameContainingIgnoreCase(name);
    }

}
