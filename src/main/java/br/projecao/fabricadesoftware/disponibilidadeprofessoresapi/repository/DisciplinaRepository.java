package br.projecao.fabricadesoftware.disponibilidadeprofessoresapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.projecao.fabricadesoftware.disponibilidadeprofessoresapi.model.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

}
