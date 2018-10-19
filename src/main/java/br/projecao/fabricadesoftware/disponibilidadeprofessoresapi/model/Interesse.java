package br.projecao.fabricadesoftware.disponibilidadeprofessoresapi.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
public class Interesse {
	
	@Id
	@SequenceGenerator(name="dp_seq_interesse", sequenceName="dp_seq_interesse")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	@Column(nullable=false)
	private int prioridade;
	@ManyToOne
	@JoinColumn(name = "id_professor")
	@JsonIgnoreProperties(value = "interesse", allowSetters = true)
	private Usuario professor;
	@ManyToOne
	@JoinColumn(name = "id_disciplina")
	@JsonIgnoreProperties(value = "interesse", allowSetters = true)
	private Disciplina disciplina;
	@ManyToMany
    @JoinTable(name="unidades_do_interesse", joinColumns=
    {@JoinColumn(name="id_interesse")}, inverseJoinColumns=
      {@JoinColumn(name="id_unidades_academicas")})
	private Set<UnidadeAcademica> unidadesAcademicas;
	@ManyToOne
	@JoinColumn(name = "id_semestre")
	@JsonIgnoreProperties(value = "interesse", allowSetters = true)
	private Semestre semestre;
	
	private LocalDateTime dataHoraCadastro;
	private LocalDateTime dataHoraAlteracao;
	private LocalDateTime dataHoraExclusao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Set<UnidadeAcademica> getUnidadesAcademicas() {
		return unidadesAcademicas;
	}
	public void setUnidadesAcademicas(Set<UnidadeAcademica> unidadesAcademicas) {
		this.unidadesAcademicas = unidadesAcademicas;
	}
	public LocalDateTime getDataHoraCadastro() {
		return dataHoraCadastro;
	}
	public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}
	public LocalDateTime getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}
	public void setDataHoraAlteracao(LocalDateTime dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}
	public LocalDateTime getDataHoraExclusao() {
		return dataHoraExclusao;
	}
	public void setDataHoraExclusao(LocalDateTime dataHoraExclusao) {
		this.dataHoraExclusao = dataHoraExclusao;
	}
	
}
