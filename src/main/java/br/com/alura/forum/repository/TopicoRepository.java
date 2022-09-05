package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
	
	//Se houver atributo com o mesmo nome de um relacionamento no banco, usamos _ para remover a ambiguidade e forçar o JPA a escolher o relacionamento com Curso
	List<Topico> findByCurso_Nome(String nomeCurso);
}
