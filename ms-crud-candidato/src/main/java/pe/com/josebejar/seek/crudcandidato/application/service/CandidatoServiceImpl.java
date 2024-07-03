package pe.com.josebejar.seek.crudcandidato.application.service;

import org.springframework.stereotype.Service;
import pe.com.josebejar.seek.crudcandidato.domain.entidades.Candidato;
import pe.com.josebejar.seek.crudcandidato.domain.repository.CandidatoRespository;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoServiceImpl implements CandidatoService {


    private CandidatoRespository candidatoRepository;

    public CandidatoServiceImpl(CandidatoRespository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    @Override
    public List<Candidato> getAllCandidates() {
        return candidatoRepository.findAll();
    }

    @Override
    public Candidato getCandidatoById(Long id) {
        Optional<Candidato> optionalCandidate = candidatoRepository.findById(id);
        return optionalCandidate.orElse(null);
    }

    @Override
    public Candidato createCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    @Override
    public Candidato updateCandidato(Long id, Candidato candidato) {
        if (candidatoRepository.existsById(id)) {
            candidato.setId(id);
            return candidatoRepository.save(candidato);
        }
        return null;
    }

    @Override
    public void deleteCandidato(Long id) {
        candidatoRepository.deleteById(id);
    }
}
