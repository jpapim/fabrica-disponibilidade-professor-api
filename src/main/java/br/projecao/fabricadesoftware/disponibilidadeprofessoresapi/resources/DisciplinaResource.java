package br.projecao.fabricadesoftware.disponibilidadeprofessoresapi.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.projecao.fabricadesoftware.disponibilidadeprofessoresapi.model.Disciplina;
import br.projecao.fabricadesoftware.disponibilidadeprofessoresapi.resources.interfaces.Resource;

@RestController
@RequestMapping(value = "/disciplina", produces = MediaType.APPLICATION_JSON_VALUE)
public class DisciplinaResource implements Resource<Disciplina> {

	@Override
	public ResponseEntity<List<Disciplina>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Optional<Disciplina>> getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Disciplina> post(Disciplina entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Disciplina> patch(Long id, Disciplina entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Disciplina> put(Long id, Disciplina entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Disciplina> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fillInBlankFields(Disciplina entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void merge(Disciplina newEntity, Disciplina oldEntity) {
		// TODO Auto-generated method stub

	}

}
