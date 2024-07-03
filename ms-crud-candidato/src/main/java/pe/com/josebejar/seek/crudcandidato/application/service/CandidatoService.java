package pe.com.josebejar.seek.crudcandidato.application.service;

import pe.com.josebejar.seek.crudcandidato.domain.entidades.Candidato;

import java.util.List;


public interface CandidatoService {

    List<Candidato> getAllCandidates();
    Candidato getCandidatoById(Long id);
    Candidato createCandidato(Candidato candidato);
    Candidato updateCandidato(Long id, Candidato candidato);
    void deleteCandidato(Long id);
}
