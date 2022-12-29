package br.com.newtonbeltrao.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.newtonbeltrao.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
