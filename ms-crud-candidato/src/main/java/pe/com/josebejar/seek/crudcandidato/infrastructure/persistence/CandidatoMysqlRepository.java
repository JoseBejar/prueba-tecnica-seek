package pe.com.josebejar.seek.crudcandidato.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.josebejar.seek.crudcandidato.domain.entidades.Candidato;

public interface CandidatoMysqlRepository extends JpaRepository<Candidato,Long> {

}
