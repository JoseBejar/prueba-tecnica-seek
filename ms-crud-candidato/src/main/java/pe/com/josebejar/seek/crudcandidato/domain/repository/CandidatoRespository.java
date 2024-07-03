package pe.com.josebejar.seek.crudcandidato.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.josebejar.seek.crudcandidato.domain.entidades.Candidato;
@Repository
public interface CandidatoRespository extends JpaRepository<Candidato,Long> {
}
